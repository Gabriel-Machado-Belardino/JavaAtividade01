
public class ObjectList {
    private Object[] listOfObjects;

    public ObjectList(Object[] listOfObjects) {
        this.listOfObjects = listOfObjects;
    }

    public ObjectList(int length) {
        this.listOfObjects = new Object[length];
    }

    public void adicionar(Object object) throws Exception {
        for(int i = 0; i < this.listOfObjects.length; i++){
            if(this.listOfObjects[i] == null) {
                this.listOfObjects[i] = object;
                return;
            }
        }
        throw new Exception("Não foi possivel inserir um novo objeto pois não há espaço");
    }

    public Object buscar(String nome){
        for(int i = 0; i < this.listOfObjects.length; i++){
            if(this.listOfObjects[i].getName() == nome) return this.listOfObjects[i];
        }
        return null;
    }

    public void atualizar(int indice, Object object) throws Exception {
        if(indice > this.listOfObjects.length - 1){
            throw new Exception("A lista não possi esse indice");
        }
        this.listOfObjects[indice] = object;
    }

    public void remover(int indice)  throws Exception{
        if(indice > this.listOfObjects.length - 1){
            throw new Exception("A lista não possi esse indice");
        }
        this.listOfObjects[indice] = null;
        if(indice <  this.listOfObjects.length){
            // Então deve atualizar a ordem dos valores
            for(int i = indice; i < this.listOfObjects.length - 1; i++){
                this.listOfObjects[i] = this.listOfObjects[i + 1];
            }
        }
    }

    public void listar(){
        for(int i = 0; i < this.listOfObjects.length; i++){
            System.out.println(i + " - " + this.listOfObjects[i]);
        }
    }
}
