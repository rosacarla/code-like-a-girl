# ♟️Mentoria: GFT Start Woman Java Desafio Técnico 

<p align="justify">Mentoria com objetivo de realizar exercícios práticos para ajudar na resoluçao do Desafio Técnico que poderá ser proposto após conclusão do Bootcamp GFT Start Woman Java.</p>

---  

## 📌Pré-requisitos

- [x] Java JDK 8+ 
- [x] IDE para desenvolvimento Java (usada IntelliJ Community)
- [x] Conhecimento básico sobre Git e GitHub
- [x] Sintáxe básica Java
- [x] Noções de POO  

---  

## 🧠 Pensamento Computacional e Programação Orientada a Objetos

### 🖥️ Pensamento Computacional

<p align="justify">A capacidade criativa, crítica e estratégica de utilizar as bases computacionais nas diferentes áreas de conhecimento para a resolução de problemas.</p>

---  

### 🔠 Programação Orientada a Objetos

<p align="justify">Modelo de análise, projeto e programação baseado na aproximação entre o mundo real e o mundo virtual, através da criação e interação entre classes, atributos, métodos, objetos, entre outros.</p>  

---  

### 🎳 Vantagens da Orientação a Objetos
<ul>
<li>Paradigma mais utilizado no desenvolvimento​</li>
<li>Redução do custo de manutenção</li>
<li>Aumento de reutilização de código</li>
<li>Aumento de segurança de sistemas​</li>
<li>Melhor interação entre as fases do projeto​</li>
<li>Torna o trabalho em equipe mais produtivo​</li>
</ul>

---  

## 👟 Exercícios  
<ol>
<li>
	<p>
	<strong>Número Reverso:</strong><br>
	Faça um programa que leia um valor inteiro (este número deverá conter 4 dígitos). A saída deverá ser o reverso de um número inteiro informado.<br>
	Exemplo: Digamos que a entrada foi 3257. A resposta será 7523.<br>
	</p>
	<p>
	Regras:<br>
		a) A entrada deverá estar entre 1000 e 9999;<br>
		b) Se o usuário digitar 3 dígitos ou menos, o Programa avisa que deve conter 4 dígitos e continua a programação até a resposta final.<br>	
		</p>
</li>
<li>
<p>
	<strong>Classe Macaco:</strong><br>
	Faça um programa e teste interativamente uma classe que modele um macaco com os atributos “nome” e “bucho” (estômago) e os métodos “comer”, “verBucho” e “digerir”.<br>
	</p>
	<p>
		Regras:<br> 
		a) Crie 2 macacos; <br>
		b) Considere que a quantidade máxima de alimentos é 3. Com isso, lembre-se de verificar o conteúdo do estômago a cada refeição (método “comer”). Por fim, o método “digerir” deve esvaziar o bucho do Macaco; <br> 
		c) Alimentos “digeríveis” devem ser do tipo String, garanta isso em seu código para que não haja nenhum Macaco canibal 🙈.<br>
		</p>
</li>
<li>
<p>
	<strong>Funcionários:</strong><br>
	Considerando o diagrama abaixo, feito para uma empresa de vendas, nesse contexto utilize o conceito de Herança para remodelá-lo e implemente um programa que explore o domínio em questão:<br> 
	<a href="https://imgbb.com/"><img src="https://i.ibb.co/Hz5c08z/Screenshot-from-2022-05-23-15-16-50.png" alt="Screenshot-from-2022-05-23-15-16-50" border="0"></a>
</p>
	<p>
	Regras:<br> 
	a) Crie uma classe mãe chamada Funcionario com os atributos nome, cpf (passados pelo construtor), uma constante para armazenar o valor do salário mínimo e um método abstrato “calcularSalario”; <br>
	b) Vendedores ganham 1 salário mínimo, mais uma comissão por vendas; <br>
	c) Consultores ganham somente pelas horas que trabalharam. <br>
	</p>
</li>

	
</ol>

---  

## 💙 Desafio  

<strong>Jogo de Craps:</strong><br>
Faça um programa que implemente um jogo de Craps. O jogador lança um par de dados, obtendo um valor entre 2 e 12.<br>

Regras:<br>
a) Se, na primeira jogada, tirar 7 ou 11, você é um "Natural" e ganha;<br>
b) Se tirar 2, 3 ou 12 na primeira jogada, isto é chamado de "Craps" e você perdeu;<br>
c) Se, na primeira jogada, fizer um 4, 5, 6, 8, 9 ou 10, este é seu "Ponto";<br>
d) Seu objetivo agora é continuar jogando os dados até tirar este número novamente;<br>
e) Você perde, no entanto, se tirar um 7 antes de tirar este Ponto novamente.<br>
</p>  

---  

## 🏁Soluções desenvolvidas

[Classe NumeroReverso](https://github.com/rosacarla/Mentoria-GFT-Start-Java-Desafio-Tecnico/blob/master/src/desafios/NumeroReverso.java)  
[Classe Macaco](https://github.com/rosacarla/Mentoria-GFT-Start-Java-Desafio-Tecnico/blob/master/src/desafios/Macaco.java)  
[Pacote Funcionarios](https://github.com/rosacarla/Mentoria-GFT-Start-Java-Desafio-Tecnico/tree/master/src/desafios/funcionarios)  
[Classe JogoCraps](https://github.com/rosacarla/Mentoria-GFT-Start-Java-Desafio-Tecnico/blob/master/src/desafios/desafio/JogoCraps.java)  
[Classe Main - para executar códigos](https://github.com/rosacarla/Mentoria-GFT-Start-Java-Desafio-Tecnico/blob/master/src/Main.java)  

---  

## ✍️ Autora  

Carla Edila Silveira  
Contato: rosa.carla@pucpr.edu.br  

---

## 🔗 Links úteis  

[Exercícios resolvidos de Orientação a Objetos em Java](https://dev.to/guilhermemanzano/exercicios-resolvidos-de-orientacao-a-objetos-em-java-4b6g)  
[Java Collections: Como utilizar Collections](https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450)  
[Java e Orientação a Objetos > Resoluções de Exercícios](https://www.alura.com.br/apostila-java-orientacao-objetos/resolucoes-exercicios?gclid=Cj0KCQjw-daUBhCIARIsALbkjSbgCqqHxJHTyPyo3OarlvROfOLrtsLXPTdvUkNrZmCfeHqPVhPUDW8aAiVfEALw_wcB)  
[POO - Programação Orientada a Objetos - Exercícios Resolvidos de Java](https://www.arquivodecodigos.com.br/dicas/3435-java-poo-programacao-orientada-a-objetos-exercicio-resolvido-2-a-classe-circulo-construtores-metodos-getters-e-setters-e-encapsulamento.html)  
[Programação Orientada a Objetos - exercícios](https://github.com/tiagoboeing/poo)

---
