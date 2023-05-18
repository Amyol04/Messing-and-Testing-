# Basic Python Syntax


# Types of variables
a = 1  # int
b = "Hello"  # str
c = [1, 2, 3]  # list
d = (1, 2, 3)  # tuple
f = {"f": 2, "e": 4, "d": 41}  # set

# Operators
a = a + 1
b = b + " World"
c = c + [4, 5, 6]

# String formatting
a = f"Hello {b} The answer is {c}, {d}, {f}"


# Functions
# Function are defined using the def keyword

# 1. def
# 2. function name
# 3. parameters () or "arguments"
# 4. :
# 5. body (on a new line), indentation is important


def very_complex_math(x, y):
    return x + y


a, b = 1, 2

output = very_complex_math(a, b)

print(output)


def myfunction():
    a = 5
    b = 6


def myotherfunction():
    a = 3


print(a)


print(list(range(10)))


for i in range(10):
    print(i)

for i in [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]:
    print(i)


# ---
i = 50
while True:
    print(i)
    i += 2

    if i == 100:
        break


if a == 1:
    print("hello")

try:
    a = 1 / 0
except Exception as e:
    print(e)
