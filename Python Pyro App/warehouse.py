import Pyro4
import person

@Pyro4.expose
class Warehouse(object):
    def __init__(self):
        self.contents = ["chair", "bike", "flashlight", "laptop", "couch"]

    def list_contents(self):
        return self.contents

    def take(self, name, item):
        self.contents.remove(item)
        print("{0} took the {1}.".format(name, item))

    def store(self, name, item):
        self.contents.append(item)
        print("{0} stored the {1}.".format(name, item))

def main():
    Pyro4.Daemon.serveSimple(
            {
                Warehouse: "example.warehouse"
            },
            ns = False)

if __name__=="__main__":
    main()