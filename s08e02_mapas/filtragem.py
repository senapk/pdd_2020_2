
class Pessoa:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    def __str__(self):
        return self.name + ":" + str(self.age)

pessoas = [Pessoa("ana", 5), Pessoa("bia", 2), Pessoa("caio", 7)]

menores = [p.name for p in pessoas if "c" in p.name]

for pessoa in menores:
    print(pessoa)

