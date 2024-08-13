public class Main {
    public static void main(String[] args) {
        try {
            // Criando objetos
            Object obj1 = new Object("Objeto 1", 10.5f, 5.2f);
            Object obj2 = new Object("Objeto 2", 7.0f, 3.3f);
            Object obj3 = new Object("Objeto 3", 12.0f, 4.8f);

            // Criando lista de objetos com tamanho 5
            ObjectList objectList = new ObjectList(5);

            // Adicionando objetos à lista
            objectList.adicionar(obj1);
            objectList.adicionar(obj2);
            objectList.adicionar(obj3);

            // Listando todos os objetos
            System.out.println("Lista de objetos:");
            objectList.listar();

            // Buscando um objeto pelo nome
            Object encontrado = objectList.buscar("Objeto 2");
            if (encontrado != null) {
                System.out.println("\nObjeto encontrado: " + encontrado);
            } else {
                System.out.println("\nObjeto não encontrado");
            }

            // Atualizando um objeto na lista
            Object obj4 = new Object("Objeto 4", 15.0f, 6.0f);
            objectList.atualizar(1, obj4);

            System.out.println("\nLista após atualização:");
            objectList.listar();

            // Removendo um objeto da lista
            objectList.remover(0);

            System.out.println("\nLista após remoção:");
            objectList.listar();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
