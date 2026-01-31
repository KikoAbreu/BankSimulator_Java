# 💳 Simulação de Conta Bancária

Projeto pessoal que simula o funcionamento básico de uma conta bancária, aplicando regras de negócio comuns do sistema financeiro, como uso de saldo, cheque especial e cobrança de taxas.

O objetivo do projeto é praticar lógica de programação, organização de código e implementação de regras de negócio de forma clara e estruturada.

---

## 📌 Funcionalidades

A conta bancária permite executar as seguintes operações:

- Consultar saldo da conta
- Consultar limite de cheque especial
- Depositar dinheiro
- Sacar dinheiro
- Pagar boletos
- Verificar se a conta está utilizando cheque especial

---

## 🧠 Regras de Negócio

O projeto segue as regras abaixo:

- A conta bancária possui um **saldo principal** somado a um **limite de cheque especial**
- O valor do cheque especial é definido no momento da criação da conta
- Se o valor depositado na criação da conta for **R$ 500,00 ou menos**, o limite do cheque especial será **R$ 50,00**
- Para valores **acima de R$ 500,00**, o cheque especial corresponde a **50% do valor depositado**
- Caso o limite do cheque especial seja utilizado, assim que houver saldo disponível, será cobrada uma **taxa de 20% sobre o valor utilizado do cheque especial**

---

## ⚙️ Como funciona

- O sistema controla automaticamente o uso do saldo e do cheque especial
- Ao realizar saques ou pagamentos, o sistema verifica se há saldo suficiente
- Caso o saldo seja insuficiente, o valor restante é retirado do cheque especial
- Quando a conta recebe depósitos e há uso do cheque especial, a taxa é aplicada conforme as regras

---

## 🛠️ Tecnologias Utilizadas

- Linguagem: Java
- Paradigma: Programação Orientada a Objetos

---

## 🚀 Objetivo do Projeto

Este projeto foi desenvolvido com fins educacionais, com foco em:

- Prática de regras de negócio
- Simulação de cenários reais
- Desenvolvimento de lógica de programação
- Organização e clareza no código

---

## 📂 Como executar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/KikoAbreu/BankSimulator_Java.git
