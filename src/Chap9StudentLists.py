from typing import Iterable, Set


# A class to keep track of lists of students. Instances get an implicit ID via their insertion into the
# list of classes, with which a new class can be created
class Chap9StudentList:
    classes = []

    # Create new instance from a Set of students
    def __init__(self, students: Set):
        self.students = students
        self.classes.append(self)

    # Create new instance from existing instance, if available
    @classmethod
    def from_existing(cls, id, students_to_remove: Iterable, students_to_add: Iterable):
        try:
            existing_class = cls.classes[id]
        except IndexError:
            raise Exception(f"No class with id {id} found")

        students = existing_class.students.copy() - students_to_remove + students_to_add

        cls(students)  # calls __init__()
