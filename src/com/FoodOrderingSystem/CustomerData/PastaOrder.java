package com.FoodOrderingSystem.CustomerData;

import com.FoodOrderingSystem.MenuItems.PastaFlavour;
import com.FoodOrderingSystem.MenuItems.TypeOfPasta;

public class PastaOrder {
    private PastaFlavour pastaFlavour;
    private TypeOfPasta typeOfPasta;
    private int quantity;

    public PastaOrder(PastaFlavour pastaFlavour, TypeOfPasta typeOfPasta, int quantity) {
        this.pastaFlavour = pastaFlavour;
        this.typeOfPasta = typeOfPasta;
        this.quantity = quantity;
    }

    public PastaFlavour getPastaFlavour() {
        return pastaFlavour;
    }

    public void setPastaFlavour(PastaFlavour pastaFlavour) {
        this.pastaFlavour = pastaFlavour;
    }

    public TypeOfPasta getTypeOfPasta() {
        return typeOfPasta;
    }

    public void setTypeOfPasta(TypeOfPasta typeOfPasta) {
        this.typeOfPasta = typeOfPasta;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\nPastaOrder{" +
                "pastaFlavour =" + pastaFlavour +
                ", typeOfPasta =" + typeOfPasta +
                ", quantity =" + quantity +
                '}';
    }
}
