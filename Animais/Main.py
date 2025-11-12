

from Cachorro import *
from Gato import *

animais = list()

ag1 = Animal()
ag1.emitirSom()
c1 = Cachorro()
g1 = Gato()
animais.append(c1)
animais.append(g1)

for i in animais:
    print(i.emitirSom())

