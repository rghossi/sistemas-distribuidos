from warehouse import Warehouse
from person import Person

warehouse = Warehouse()

rafael = Person("Rafael")
livia = Person("Livia")

rafael.visit(warehouse)
livia.visit(warehouse)