
# O nome da classe será começará sempre maiuscúla. 
import datetime


class Animais():
    # As classes podem ter atributos globais que serão definitos para todos os objetos:
    agora = datetime.datetime.now()# Obtém a hora atual
    hora_cad = agora.strftime("%H:%M:%S")# Formata a hora como uma string 

    # O contrutor no python é a função/método init abaixo:
    def __init__(self, nome, idade, som=False, comendo=False):
        #Atributos:
        self.nome = nome
        self.idade = idade
        self.som = som
        self.comendo = comendo

    #Métodos:
    def comer(self, alimento):
        self.alimento = alimento
        #verificar se o animal está comendo:
        if self.som:
            print(f"{self.nome} não pode comer emitindo o seu som...")
            return
        if self.comendo:
            print(f"{self.nome} já está comendo {self.alimento}...")
            return
        print(f"{self.nome} está comendo {self.alimento}...")
        self.comendo = True

    def stop_comer(self):
        if not self.comendo:
            print(f"{self.nome} não está comendo...")
            return
        print(f"{self.nome} parou de comer {self.alimento}...")
        self.comendo = False

    def emitir_som(self, som_animal):
        self.som_animal = som_animal
        if self.comendo:
            print(f"{self.nome} não pode emitir seu som comendo...")
            return
        print(f"O som do {self.nome} é {self.som_animal}")
        self.som = True
    
    def stop_som(self):
        if not self.som:
            print(f"{self.nome} não está emitindo som...")
            return
        print(f"{self.nome} parou de emitir seu som...")
        self.som = False

    # pass # declaração nula, não faz nada;
