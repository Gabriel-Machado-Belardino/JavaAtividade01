- 5.1 - Caso seja necessário alterar o tamanho do vetor, como isso pode ser feito? Se o código entregue não suporte essa
  alteração, liste as melhorias necessárias para que a alteração seja possível.

> O sistema não suporta essa alteração de tamanho, mas para adapta-lo seria necessário criar uma função de alteração do
> tamanho da qual criariaria um novo array com o tamanho indicado, passar os objetos para o novo array e substituir o
> instanciamento do array antigo para o novo. Tambem é necessário adicionar uma validação para não permitir a alteração
> de tamanha para o qual os iten atuais não coubessem.

- 5.2 - O que acontecerá caso o usuário tente incluir uma quantidade de itens maior do que o tamanho do vetor? Existe algo
que possa ser feito para mitigar esse risco?
> O sistema lança uma exceção falando que o tamnho do array não suporta essa inserção já que não possui espaço.

- 5.3 - O que acontecerá caso o usuário tente excluir um item que não existe no vetor?
> O sistema lança uma exceção falando que o item não existe no vetor.