import json ;

def calcular_faturamento(file_path):
    try:
        # Leitor do arquivo JSON -->
        with open(file_path, 'r') as file:
            dados = json.load(file)
        
        # Filtra os valores de faturamento e ignoran os dias sem faturamento -->
        valores = [dia['valor'] for dia in dados if dia['valor'] > 0]
        
        if not valores:
            raise ValueError("Não há dados de faturamento disponíveis")

        menor_faturamento = min(valores)
        maior_faturamento = max(valores)
        soma_faturamento = sum(valores)
        dias_com_faturamento = len(valores)
        
        # Média mensal -->
        media_mensal = soma_faturamento / dias_com_faturamento

        # Conta o número de dias com faturamento acima da média -->
        dias_acima_media = sum(1 for valor in valores if valor > media_mensal)

        # Exibe os resultados -->
        print(f"Menor faturamento ocorrido em um dia do mês: {menor_faturamento}")
        print(f"Maior faturamento ocorrido em um dia do mês: {maior_faturamento}")
        print(f"Número de dias com faturamento acima da média mensal: {dias_acima_media}")


    except Exception as e:
        print(f"Ocorreu um erro: {e}")

# Caminho para o arquivo JSON -->
file_path = 'data_faturamento.json'
# Resposta -->
calcular_faturamento(file_path)