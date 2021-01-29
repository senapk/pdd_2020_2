from typing import List, Dict

lista: List[str] = ["avo", "ivo", "uva", "ovo"]

print(lista[2])

sapatos: Dict[str, List[str]] = {}
sapatos["joao"] = ["red", "blue"]
sapatos["leticia"] = ["pink", "violet"]
sapatos["wermyson"] = ["black", "black", "black"]

print("leticia" in sapatos.keys())
print(sapatos["wermyson"])

