import java.util.Objects;

public class Notebook {
    private int price;
    private String manufacturerName;
    private String processorName;
    private int memorySize;
    private Float weight;
    private String typeOfHdd;
    private int sizeOfHdd;
    private String nameOs;
    private String color;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void setTypeOfHdd(String typeOfHdd) {
        this.typeOfHdd = typeOfHdd;
    }

    public void setSizeOfHdd(int sizeOfHdd) {
        this.sizeOfHdd = sizeOfHdd;
    }

    public void setNameOs(String nameOs) {
        this.nameOs = nameOs;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void set(int price, String manufacturerName, String processorName, int memorySize, Float weight,
            String typeOfHdd, int sizeOfHdd, String nameOs, String color) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
        this.memorySize = memorySize;
        this.weight = weight;
        this.typeOfHdd = typeOfHdd;
        this.sizeOfHdd = sizeOfHdd;
        this.nameOs = nameOs;
        this.color = color;
    }

    public void set(int price, String manufacturerName, String processorName, int memorySize, Float weight,
            String typeOfHdd, int sizeOfHdd, String nameOs) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
        this.memorySize = memorySize;
        this.weight = weight;
        this.typeOfHdd = typeOfHdd;
        this.sizeOfHdd = sizeOfHdd;
        this.nameOs = nameOs;
    }

    public void set(int price, String manufacturerName, String processorName, int memorySize, Float weight,
            String typeOfHdd, int sizeOfHdd) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
        this.memorySize = memorySize;
        this.weight = weight;
        this.typeOfHdd = typeOfHdd;
        this.sizeOfHdd = sizeOfHdd;
    }

    public void set(int price, String manufacturerName, String processorName, int memorySize, Float weight,
            String typeOfHdd) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
        this.memorySize = memorySize;
        this.weight = weight;
        this.typeOfHdd = typeOfHdd;
    }

    public void set(int price, String manufacturerName, String processorName, int memorySize, Float weight) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
        this.memorySize = memorySize;
        this.weight = weight;
    }

    public void set(int price, String manufacturerName, String processorName, int memorySize) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
        this.memorySize = memorySize;
    }

    public void set(int price, String manufacturerName, String processorName) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
    }

    public void set(int price, String manufacturerName) {
        this.price = price;
        this.manufacturerName = manufacturerName;
    }

    public int getPrice() {
        return price;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getProcessorName() {
        return processorName;
    }
    public int getMemorySize() {
        return memorySize;
    }
    public Float getWeight() {
        return weight;
    }
    public String getTypeOfHdd() {
        return typeOfHdd;
    }
    public int getSizeOfHdd() {
        return sizeOfHdd;
    }
    public String getNameOs() {
        return nameOs;
    }
    public String getColor() {
        return color;
    }

    public void get(int price, String manufacturerName, String processorName, int memorySize, Float weight,
            String typeOfHdd, int sizeOfHdd, String nameOs, String color) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
        this.memorySize = memorySize;
        this.weight = weight;
        this.typeOfHdd = typeOfHdd;
        this.sizeOfHdd = sizeOfHdd;
        this.nameOs = nameOs;
        this.color = color;
    }
    public void get(int price, String manufacturerName, String processorName, int memorySize, Float weight,
            String typeOfHdd, int sizeOfHdd, String nameOs) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
        this.memorySize = memorySize;
        this.weight = weight;
        this.typeOfHdd = typeOfHdd;
        this.sizeOfHdd = sizeOfHdd;
        this.nameOs = nameOs;
    }
    public void get(int price, String manufacturerName, String processorName, int memorySize, Float weight,
            String typeOfHdd, int sizeOfHdd) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
        this.memorySize = memorySize;
        this.weight = weight;
        this.typeOfHdd = typeOfHdd;
        this.sizeOfHdd = sizeOfHdd;
    }
    public void get(int price, String manufacturerName, String processorName, int memorySize, Float weight,
            String typeOfHdd) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
        this.memorySize = memorySize;
        this.weight = weight;
        this.typeOfHdd = typeOfHdd;
    }
    public void get(int price, String manufacturerName, String processorName, int memorySize, Float weight) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
        this.memorySize = memorySize;
        this.weight = weight;
    }
    public void get(int price, String manufacturerName, String processorName, int memorySize) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
        this.memorySize = memorySize;
    }
    public void get(int price, String manufacturerName, String processorName) {
        this.price = price;
        this.manufacturerName = manufacturerName;
        this.processorName = processorName;
     }
     public void get(int price, String manufacturerName) {
        this.price = price;
        this.manufacturerName = manufacturerName;
     }
   

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Notebook notebook =(Notebook) o;
        return Objects.equals(price, notebook.price) 
                && Objects.equals(manufacturerName, notebook.manufacturerName)
                 && Objects.equals(processorName, notebook.processorName) && Objects.equals(memorySize, notebook.memorySize) 
                 && Objects.equals(weight, notebook.weight) && Objects.equals(typeOfHdd, notebook.typeOfHdd)
                 && Objects.equals(sizeOfHdd, notebook.sizeOfHdd) && Objects.equals(nameOs, notebook.nameOs)
                 && Objects.equals(color, notebook.color);
                }
    @Override
    public int hashCode() {
        return Objects.hash(price,manufacturerName,processorName,memorySize,weight,
                            typeOfHdd,sizeOfHdd,nameOs,color);
    }
    @Override

    public String toString() {
        return "\n Цена : " + price + " Произв. : " + manufacturerName +
                " Произв. Процессора : " + processorName + " Размер ОЗУ : " + memorySize + " Гб" +
                " Вес : " + weight + " Тип HDD : " + typeOfHdd + " Размер HDD : " + sizeOfHdd + " Гб"+
                " ОС: " + nameOs + " Цвет: " + color;
    }
}
