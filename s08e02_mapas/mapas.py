        self.age: int = age
    def __str__(self):
        return self.name + ":" + str(self.age)

pessoas: List[Pessoa] = [Pessoa("ana", 5), Pessoa("bia", 2), Pessoa("caio", 7)]

#print(pessoas[2]) # acesso aleatório

apelidos: Dict[str, Pessoa] = {} # dict key value
apelidos["vivi"] = Pessoa("David", 36)
apelidos["cabiludo"] = Pessoa("Wermyson", 18)
apelidos["harrypotter"] = Pessoa("Joas", 20)
apelidos["travesseiro"] = Pessoa("Leticia", 18)
apelidos["lagartixa"] = Pessoa("Luis", 15)

for key in apelidos.keys():
    print(key, end=" ")
print()

for pessoa in apelidos.values():
    print(pessoa, end=" ")
print()

for key in apelidos:
    print(key, apelidos[key])