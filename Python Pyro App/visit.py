from warehouse import Warehouse
from person import Person

import sys
import Pyro4

if sys.version_info<(3,0):
    input = raw_input

uri = input("Enter the uri of the warehouse: ").strip()
warehouse = Pyro4.Proxy(uri)

rafael = Person("Rafael")
livia = Person("Livia")

rafael.visit(warehouse)
livia.visit(warehouse)