class Project:

    def __init__(self, id, name):
        self.id = id
        self.name = name

    def Project_details(self, id, name, projects):
        self.id = id
        self.name = name
        self.users = projects

    def user(self, id, name, salary):
        self.id = id
        self.name = name
        self.salary = salary


class child1(Project):
    def set_id(self):
        return self.id

    def set_name(self):
        return self.name


p = Project()
users = ['User 1', 'User 2', 'User 3']
projects = [[users]]
dict = {p.set_id: p.set_name}

p.Project_details(1, 'P1', projects)
p.user(1, 'User 1', 1000)

print(dict)
