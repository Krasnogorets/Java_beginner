import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HWfinal {
    public static Set<Notebook> notebooksInStore = new HashSet<Notebook>();
    public static Map<String, String> filter = new HashMap<>();
    public static Set<String> tempList = new HashSet<String>();
    public static Set<Float> tempListFloat = new HashSet<Float>();
    public static Set<Integer> tempListInt = new HashSet<Integer>();
    public static Set<Notebook> filtredSet = new HashSet<>();
    public static Set<Notebook> filtredSetTemp = new HashSet<>();
    public static int choiceNumber = 0; 
    public static List<Integer> numList = new ArrayList<Integer>();
    public static String[] tempArr = new String[0];
    public static Integer [] tempArrInt = new Integer[0];
    public static List<Float> tempArrFloat = new ArrayList<Float>();
    // public static Float [] tempArrFloat = new Float[0];


    public static void fillTheNotebooks() {
        Notebook notebook1 = new Notebook();
        notebook1.set(20000, "ACER", "Intel", 8, 2.9f, "HDD", 256, "no OS", "black");
        Notebook notebook2 = new Notebook();
        notebook2.set(21000, "ACER", "Intel", 8, 2.9f, "HDD", 256, "no OS", "silver");
        Notebook notebook3 = new Notebook();
        notebook3.set(25000, "ACER", "Intel", 8, 2.9f, "SSD", 512, "no OS", "silver");
        Notebook notebook4 = new Notebook();
        notebook4.set(27000, "ACER", "Intel", 8, 2.7f, "SSD", 512, "Linux", "silver");
        Notebook notebook5 = new Notebook();
        notebook5.set(30000, "ACER", "Intel", 8, 2.7f, "SSD", 512, "Win11", "silver");
        Notebook notebook6 = new Notebook();
        notebook6.set(35000, "ACER", "Intel", 16, 2.7f, "SSD", 512, "Win11", "silver");
        Notebook notebook7 = new Notebook();
        notebook7.set(30000, "ACER", "AMD", 8, 2.7f, "SSD", 512, "Win11", "silver");
        Notebook notebook8 = new Notebook();
        notebook8.set(30000, "ACER", "AMD", 8, 2.7f, "SSD", 512, "Win11", "black");
        Notebook notebook9 = new Notebook();
        notebook9.set(30000, "ACER", "AMD", 8, 2.7f, "SSD", 512, "Win11", "blue");
        Notebook notebook11 = new Notebook();
        notebook11.set(21000, "ASUS", "Intel", 8, 2.8f, "HDD", 256, "no OS", "black");
        Notebook notebook12 = new Notebook();
        notebook12.set(22000, "ASUS", "Intel", 8, 2.8f, "HDD", 256, "no OS", "silver");
        Notebook notebook13 = new Notebook();
        notebook13.set(26000, "ASUS", "AMD", 8, 2.8f, "SSD", 512, "no OS", "silver");
        Notebook notebook14 = new Notebook();
        notebook14.set(28000, "ASUS", "Intel", 8, 2.5f, "SSD", 512, "Linux", "silver");
        Notebook notebook15 = new Notebook();
        notebook15.set(31000, "ASUS", "Intel", 8, 2.5f, "SSD", 512, "Win11", "silver");
        Notebook notebook16 = new Notebook();
        notebook16.set(36000, "ASUS", "Intel", 16, 2.5f, "SSD", 512, "Win11", "silver");
        Notebook notebook17 = new Notebook();
        notebook17.set(31000, "ACER", "AMD", 8, 2.5f, "SSD", 512, "Win11", "silver");
        Notebook notebook18 = new Notebook();
        notebook18.set(31000, "ASUS", "AMD", 8, 2.5f, "SSD", 512, "Win11", "black");
        Notebook notebook19 = new Notebook();
        notebook19.set(31000, "ASUS", "AMD", 8, 2.5f, "SSD", 512, "Win11", "blue");
        notebooksInStore.add(notebook1);
        notebooksInStore.add(notebook2);
        notebooksInStore.add(notebook3);
        notebooksInStore.add(notebook4);
        notebooksInStore.add(notebook5);
        notebooksInStore.add(notebook6);
        notebooksInStore.add(notebook7);
        notebooksInStore.add(notebook8);
        notebooksInStore.add(notebook9);
        notebooksInStore.add(notebook11);
        notebooksInStore.add(notebook12);
        notebooksInStore.add(notebook13);
        notebooksInStore.add(notebook14);
        notebooksInStore.add(notebook15);
        notebooksInStore.add(notebook16);
        notebooksInStore.add(notebook17);
        notebooksInStore.add(notebook18);
        notebooksInStore.add(notebook18);
    }

    public static void input() {
        boolean flag = true;
        while (flag) {
            Scanner iScan = new Scanner(System.in);

            System.out.println(
                    "Вы можете искать по (можно по всем фильтрам) : \n цене;  производителю;   производителю процессора;   объему ОЗУ;   весу;  \n типу жесткого диска;   размеру жесткого диска;   установленной ОС;   цвету;");
            System.out.print(
                    "ввести параметры (1-да, 2-нет,выйти), 3 - показать текущие фильтры, 4 - вывести ноутбуки по заданному фильтру , 5- сбросить фильтр: ");
            int inputString = iScan.nextInt();
            if (inputString == 2) {
                flag = false;
                iScan.close();
            } else if (inputString == 3) {
                System.out.println("Фильтр для поиска: " + filter);
            } else if (inputString == 4) {
                getData();
            } 
            else if (inputString == 5) {
                filter.clear();
                filtredSet.addAll(notebooksInStore);
            }
            else if (inputString == 1) {
                System.out.println("Введите параметры для поиска нужного Вам ноутбука: ");
                System.out.println(
                        "\n 1 - цена, \n 2 - производитель, \n 3 - производитель процессора, \n 4 - объем ОЗУ, \n 5 - вес; \n 6 - тип жесткого диска; \n 7 - размер жесткого диска; \n 8 - установленная ОС; \n 9 - цвет;");

                int inputString1 = iScan.nextInt();
                if (inputString1 < 1 || inputString1 > 9) {
                    System.out.println("такого варианта нет!");
                    continue;
                } else {
                    getDataForFilter(inputString1);
                }
            }
        }
    }

    public static void getDataForFilter(int choice) {
        Scanner iScan = new Scanner(System.in);
        switch (choice) {
            case 1:
            numList.clear();
                for (Notebook price : filtredSet) {
                    numList.add(price.getPrice());
                }
                Collections.sort(numList);
                System.out
                        .printf("После фильтрации -мин цена:" + numList.get(0) + " макс. цена:" + numList.get(numList.size() - 1));
                System.out.println();
                System.out.println("введите МАКС. цену :");
                int maxPrice = iScan.nextInt();
                filter.put("price", String.valueOf(maxPrice));
                System.out.println("Фильтр для поиска: " + filter);
                numList.clear();
                break;
            case 2:
                tempList.clear();
                int count = 0;
                for (Notebook manufacturerName : filtredSet) {
                    tempList.add(manufacturerName.getManufacturerName());
                }
                tempArr = tempList.toArray(new String[tempList.size()]);
                System.out.println("После фильтрации- выбор производителей: ");
                for (String item : tempArr) {
                    System.out.print(count + " - " + item + " ; ");
                    count++;
                }
                
                System.out.println();
                System.out.println("введите номер производителя:");
                choiceNumber = iScan.nextInt();
                if (choiceNumber > count - 1 || choiceNumber < 0) {
                    System.out.println("такого варианта нет!");
                    break;
                } else {
                    filter.put("manufacturerName", tempArr[choiceNumber]);
                    System.out.println("Фильтр для поиска: " + filter);
                    tempList.clear();
                    break;
                }
            case 3:
                tempList.clear();
                count = 0;
                for (Notebook processorName : filtredSet) {
                    tempList.add(processorName.getProcessorName());
                }
                tempArr = tempList.toArray(new String[tempList.size()]);
                System.out.println("После фильтрации- выбор процессоров: ");
                for (String item : tempArr) {
                    System.out.print(count + " - " + item + " ; ");
                    count++;
                }
                System.out.println();
                System.out.println("введите номер произв. процессора:");
                choiceNumber = iScan.nextInt();
                if (choiceNumber > count - 1 || choiceNumber < 0) {
                    System.out.println("такого варианта нет!");
                    break;
                } else {
                    filter.put("processorName", tempArr[choiceNumber]);
                    System.out.println("Фильтр для поиска: " + filter);
                    tempList.clear();
                    break;
                }
            case 4:
                 tempList.clear();
                count = 0;
                for (Notebook memorySize : filtredSet) {
                    tempList.add(String.valueOf(memorySize.getMemorySize()));
                }
                Collections.sort(numList);
                tempArr = tempList.toArray(new String[tempList.size()]);
                System.out.println("После фильтрации - наличие объема памяти: ");
                for (String item : tempArr) {
                    System.out.print(count + " - " + item + "Гб" +" ; ");
                    count++;
                }
                System.out.println();
                System.out.println("введите номер МИН. объема памяти:");
                choiceNumber = iScan.nextInt();
                if (choiceNumber > count - 1 || choiceNumber < 0) {
                    System.out.println("такого варианта нет!");
                    break;
                } else {
                    filter.put("memorySize", tempArr[choiceNumber]);
                    System.out.println("Фильтр для поиска: " + filter);
                    numList.clear();
                    break;
                }
            case 5:
                for (Notebook weight : filtredSet) {
                    tempListFloat.add(weight.getWeight());
                }
                tempArrFloat.addAll(tempListFloat);
                Collections.sort(tempArrFloat);
                System.out
                        .printf("После фильтрации мин вес:" + tempArrFloat.get(0) + " макс. вес:" + tempArrFloat.get(tempArrFloat.size() - 1));
                System.out.println();
                System.out.println("введите МАКС. вес (допустимо дес. дробь) :");
                String maxWeight = iScan.nextLine();
                filter.put("weight", maxWeight);
                System.out.println("Фильтр для поиска: " + filter);
                tempListFloat.clear();
                tempArrFloat.clear();
                break;
            case 6:
                count = 0;
                tempList.clear();
                for (Notebook typeOfHdd : filtredSet) {
                    tempList.add(typeOfHdd.getTypeOfHdd());
                }
                tempArr = tempList.toArray(new String[tempList.size()]);
                System.out.println("После фильтрации- тип HDD: ");
                for (String item : tempArr) {
                    System.out.print(count + " - " + item + " ; ");
                    count++;
                }
                
                System.out.println();
                System.out.println("введите номер типа HDD:");
                choiceNumber = iScan.nextInt();
                if (choiceNumber > count - 1 || choiceNumber < 0) {
                    System.out.println("такого варианта нет!");
                    break;
                } else {
                    filter.put("typeOfHdd", tempArr[choiceNumber]);
                    System.out.println("Фильтр для поиска: " + filter);
                    tempList.clear();
                    break;
                }
            case 7:
                  numList.clear();
                for (Notebook sizeHdd : filtredSet) {
                    numList.add(sizeHdd.getSizeOfHdd());
                }
                Collections.sort(numList);
                System.out
                        .printf("После фильтрации -мин объем HDD:" + numList.get(0) + "Гб"+"  макс. объем HDD:" + numList.get(numList.size() - 1)+ "Гб");
                System.out.println();
                System.out.println("введите МИН. объем HDD :");
                int minSizeHdd = iScan.nextInt();
                filter.put("sizeOfHdd", String.valueOf(minSizeHdd));
                System.out.println("Фильтр для поиска: " + filter);
                numList.clear();
                break;
            case 8:
                tempList.clear();
                count = 0;
                for (Notebook nameOs : filtredSet) {
                    tempList.add(nameOs.getNameOs());
                }
                tempArr = tempList.toArray(new String[tempList.size()]);
                System.out.println("После фильтрации- выбор OS: ");
                for (String item : tempArr) {
                    System.out.print(count + " - " + item + " ; ");
                    count++;
                }
                System.out.println();
                System.out.println("введите номер OS:");
                choiceNumber = iScan.nextInt();
                if (choiceNumber > count - 1 || choiceNumber < 0) {
                    System.out.println("такого варианта нет!");
                    break;
                } else {
                    filter.put("nameOs", tempArr[choiceNumber]);
                    System.out.println("Фильтр для поиска: " + filter);
                    tempList.clear();
                    break;
                }
            case 9:
                tempList.clear();
                count = 0;
                for (Notebook color : filtredSet) {
                    tempList.add(color.getColor());
                }
                tempArr = tempList.toArray(new String[tempList.size()]);
                System.out.println("После фильтрации- выбор цвета: ");
                for (String item : tempArr) {
                    System.out.print(count + " - " + item + " ; ");
                    count++;
                }
                System.out.println();
                System.out.println("введите номер цвета:");
                choiceNumber = iScan.nextInt();
                if (choiceNumber > count - 1 || choiceNumber < 0) {
                    System.out.println("такого варианта нет!");
                    break;
                } else {
                    filter.put("color", tempArr[choiceNumber]);
                    System.out.println("Фильтр для поиска: " + filter);
                    tempList.clear();
                    break;
                }
            default:
                break;
        }
        // iScan.close();
    }

    public static void getData() {
        
        filtredSetTemp.clear();
          if (filter != null) {
            if (filter.get("price") != null) {
                for (Notebook notebook : filtredSet) {
                    if (notebook.getPrice() >= Integer.parseInt(filter.get("price"))) {
                        filtredSetTemp.add(notebook);
                    }
                }
            }
            filtredSet.removeAll(filtredSetTemp);
            filtredSetTemp.clear();
            if (filter.get("manufacturerName") != null) {
                for (Notebook notebook : filtredSet) {
                    if (!notebook.getManufacturerName().equals(filter.get("manufacturerName"))) {
                        filtredSetTemp.add(notebook);
                    }
                }
            }
            filtredSet.removeAll(filtredSetTemp);
            filtredSetTemp.clear();
            if (filter.get("processorName") != null) {
                for (Notebook notebook : filtredSet) {
                    if (!notebook.getProcessorName().equals(filter.get("processorName"))) {
                        filtredSetTemp.add(notebook);
                    }
                }
            }
            filtredSet.removeAll(filtredSetTemp);
            filtredSetTemp.clear();
            if (filter.get("memorySize") != null) {
                for (Notebook notebook : filtredSet) {
                       if (notebook.getMemorySize() > Integer.parseInt(filter.get("memorySize"))) {
                        filtredSetTemp.add(notebook);
                    }
                }
            }
            filtredSet.removeAll(filtredSetTemp);
            filtredSetTemp.clear();
            if (filter.get("weight") != null) {
                for (Notebook notebook : filtredSet) {
                       if (notebook.getWeight() > Float.parseFloat(filter.get("weight"))) {
                        filtredSetTemp.add(notebook);
                    }
                }
            }
            filtredSet.removeAll(filtredSetTemp);
            filtredSetTemp.clear();
            if (filter.get("typeOfHdd") != null) {
                for (Notebook notebook : filtredSet) {
                       if (!notebook.getTypeOfHdd().equals(filter.get("typeOfHdd"))) {
                        filtredSetTemp.add(notebook);
                    }
                }
            }
            filtredSet.removeAll(filtredSetTemp);
            filtredSetTemp.clear();
            if (filter.get("sizeOfHdd") != null) {
                for (Notebook notebook : filtredSet) {
                       if (notebook.getSizeOfHdd() < Integer.parseInt(filter.get("sizeOfHdd"))) {
                        filtredSetTemp.add(notebook);
                    }
                }
            }
            filtredSet.removeAll(filtredSetTemp);
            filtredSetTemp.clear();
            if (filter.get("nameOs") != null) {
                for (Notebook notebook : filtredSet) {
                       if (!notebook.getNameOs().equals(filter.get("nameOs"))) {
                        filtredSetTemp.add(notebook);
                    }
                }
            }
            filtredSet.removeAll(filtredSetTemp);
            filtredSetTemp.clear();
            if (filter.get("color") != null) {
                for (Notebook notebook : filtredSet) {
                       if (!notebook.getColor().equals(filter.get("color"))) {
                        filtredSetTemp.add(notebook);
                    }
                }
            }
            filtredSet.removeAll(filtredSetTemp);
            filtredSetTemp.clear();
            System.out.println(filtredSet);

             } 
             else {
            System.out.println(notebooksInStore);
        }

    }
    public static void main(String[] args) throws Exception {
        fillTheNotebooks();
        filtredSet.addAll(notebooksInStore);
        input();
    }
}
