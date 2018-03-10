#ifndef FILA_LIGADA_H_INCLUDED
#define FILA_LIGADA_H_INCLUDED

template <typename Tipo>
struct Node{

    Tipo info;
    Node<Tipo> *prox;
};


struct Fila{
    private:
    Node<Tipo> *inic;
    Node<Tipo> *fim;
    public:
    Fila(){
        inic=NULL;
        fim=NULL;
    }
    ~Fila(){ //rotina para liberar o espaço da memória q  tem os elementos da fila
        Node<Tipo> *aux=inic;
        while(inic!=NULL){
            aux = inic;
            inic=inic->prox;
            delete aux;
        }
    }
    bool insere (Tipo x){
        bool x = false;
        Node<Tipo> *aux=new Node<Tipo> // aux: variavel do tipo ponteiro para um nó - Passo 1
        if(inic!=NULL){
            x=true;
            aux->info=x; //Passo 2
            aux->prox=NULL; //Passo 3
            if(inic==NULL){
                inic=aux; //Passo 4
            }
            else{
                fim->prox=aux; //Passo 5
            }
            fim=aux;//fim aponta pro mesmo lugar, é o conteúdo de aux - Passo 6
        }
        return x;
    }
    Tipo remover(){
        Tipo temp=inic->info;
        Node<Tipo> *aux=inic;
        inic = inic->prox;
        if(inic==null){
            fim=NULL;
        }
        delete aux;
        return temp;
    }
    Tipo primeiro(){
        return inic->info;
    }
    bool filaVazia(){
        return inic==NULL;
    }
    Node<Tipo> *getInic(){ //retorno um ponteiro para um nó
        return inic;
    }
    Node<Tipo> *getFim(){
        return fim;
    }

};

#endif // FILA_LIGADA_H_INCLUDED
