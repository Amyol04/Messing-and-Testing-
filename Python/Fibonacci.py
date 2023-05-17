# sequence to print fibonacci thing 
nterms = int(input("how many terms: "))

# first two terms 
n1 = 0
n2 = 1 
count= 0


if nterms <= 0:
        print("Please enter a positive integer")

# if only one term, return 1 
elif nterms == 1: 
        print("Fibonacci sequence upto",nterms,":")
        print(n1)

# generate sequence 
else: 
     print("Fibonacci sequence:")

     while count < nterms:
       print(n1)
       nth = n1 + n2
       # update values
       n1 = n2
       n2 = nth
       count += 1       


        # Generates the Sequence using a while loop, Asks for user input, checks input
        # if the input is 0 or less then, asks for a positive interger. 
        # if term equals 1. prints n1 
        
        # else , prints Fibonacci sequence
        # while loop = prints n1. 
        # updates value and completes the loops til count is reached. 
