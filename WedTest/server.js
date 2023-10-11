const express = require('express');
const multer = require('multer');
const path = require('path');
const fs = require('fs');

const app = express();
const port = process.env.PORT || 3000;

// Create an array to store uploaded photo information
const uploadedPhotos = [];

// Set up Multer for file uploads
const storage = multer.diskStorage({
    destination: 'uploads/',
    filename: (req, file, callback) => {
        const ext = path.extname(file.originalname);
        callback(null, `${Date.now()}${ext}`);
    }
});
const upload = multer({ storage });

// Serve static files (uploaded photos)
app.use('/uploads', express.static('uploads'));

// Handle file uploads
app.post('/upload', upload.single('photo'), (req, res) => {
    const uploadedFilePath = req.file.path;

    // Store the uploaded photo information
    uploadedPhotos.push({
        filePath: uploadedFilePath,
        originalName: req.file.originalname,
    });

    res.json({ message: 'File uploaded successfully', filePath: uploadedFilePath });
});

// Retrieve uploaded photos
app.get('/photos', (req, res) => {
    res.json(uploadedPhotos);
});

// Start the server
app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});
// Function to retrieve and display uploaded photos
function displayUploadedPhotos() {
    fetch('/photos')
        .then(response => response.json())
        .then(photos => {
            const photoGallery = document.getElementById('photoGallery');

            // Clear existing photos
            photoGallery.innerHTML = '';

            photos.forEach(photo => {
                const img = document.createElement('img');
                img.src = `/uploads/${photo.filePath}`;
                img.alt = photo.originalName;
                photoGallery.appendChild(img);
            });
        })
        .catch(error => {
            console.error('Error:', error);
        });
}

// Call the function to display uploaded photos on page load
window.addEventListener('load', displayUploadedPhotos);

// Function to handle photo upload (no changes needed to this code)
// ...
