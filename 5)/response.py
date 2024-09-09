def inverter_string(s):
    # Cria uma nova string vazia para armazenar o resultado invertido
    resultado = ""
    
    # Percorre a string de trás para frente
    for i in range(len(s) - 1, -1, -1):
        resultado += s[i]
    
    return resultado



string_original = input("Digite a string para inverter: ")
string_invertida = inverter_string(string_original)
print("String invertida:", string_invertida)

