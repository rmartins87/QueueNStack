#include <iostream>
#include "Fila_ligada.h"

using namespace std;

int main()
{
    cout<< "fila Ligada" <<endl;
    Fila<int>f;
    f.insere(3);
    f.insere(5);
    f.insere(8);
    cout<< "exibindo a fila"<<endl;
    Node<int> *aux = f.getInic();
    while(aux != NULL){
        cout<<aux->info<<endl;
        aux=aux->prox;
    }
    cout<<"primeiro:"<<f.primeiro()<<endl;
    return 0;
}
