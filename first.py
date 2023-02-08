
class Person:

    def __init__(self, age, name):
        self.age = age
        self.name = name

    def say_hello(self):
        print('Hello, my name is', self.name)


bitch = Person(10, 'John')
bitch.say_hello()

a = Person(name='John', age=10)
b = Person(20, 'Jane')
c = Person(30, 'Jack')
d = Person(40, 'Jill')
e = Person(a.age + b.age, c.name + d.name)


def normal_function(args):
    return "bobcats suck balls " + args


a = normal_function("and dick")
a = normal_function("and dick")
a = normal_function("and dick")
a = normal_function("and dick")
a = normal_function("and dick")
print(a)
