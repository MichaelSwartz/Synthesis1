/******
 Name: Michael Swartz
 Assignment: Synthesis 1
 Date: 10/24/2022
 ******/


from typing import Set


# A class to keep track of lists of students. Instances get an implicit ID via their insertion into the
# list of classes, with which a new class can be created
class Chap9StudentList:
    classes = []

    # Create new instance from a Set of students
    def __init__(self, students: Set):
        self.students = students
        self.index = len(self.classes)
        self.classes.append(self)

    # Create new instance from existing instance, if available
    @classmethod
    def from_existing(cls, id: int, students_to_add: Set, students_to_remove: Set):
        try:
            existing_class = cls.classes[id]
        except IndexError:
            raise Exception(f"No class with id {id} found")

        students = existing_class.students.copy() - students_to_remove | students_to_add

        return cls(students)  # calls __init__()


# make one class with some Hamilton characters
first_class = Chap9StudentList({"John", "Mulligan", "Lafayette"})

# make a second class from the members of the first -- but add Hamilton and remove Lafayette
second_class = Chap9StudentList.from_existing(
    first_class.index, {"Hamilton"}, {"Lafayette"}
)

# make a third class from the members of the second, but remove the members shared with the first
# and add some others manually
third_class = Chap9StudentList.from_existing(
    second_class.index, {"Washington", "Eliza", "Angelica"}, first_class.students
)

# show what's in them all:
for studentList in Chap9StudentList.classes:
    print(studentList.students)


"""
Prints:

{'Lafayette', 'Mulligan', 'John'}
{'Mulligan', 'Hamilton', 'John'}
{'Eliza', 'Hamilton', 'Angelica', 'Washington'}
"""
