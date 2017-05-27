
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class ArrayHolder {
    private Scanner scn = new Scanner(System.in);
    private ArrayList<Integer> getNum = new ArrayList<>(getNumb());
    private int num;

    public ArrayList<Integer> getGetNum() {
        return getNum;
    }

    private int getNumb() {
        return num;
    }


    void enterNum() {
        num = scn.nextInt();
        for (int i1 = 0; i1 < num; i1++) {
            System.out.println("Введите число " + i1 + ":");
            int numbers = scn.nextInt();
            getNum.add(numbers);
        }
    }


    void addNum() {

        System.out.println("Введите число которое хотите добавить:");
        int newNumb = scn.nextInt();
        for (int i = 0; i <getGetNum().size(); i++) {
            int add=getGetNum().get(i);
            getGetNum().set(i,add+newNumb);
        }
        getGetNum().add(newNumb);
        System.out.println("Число добавлено.");
    }

    void removeNum() {
        System.out.println("Введите число которое хотите удалить:");
        int removeNumb = scn.nextInt();
        getGetNum().remove(getGetNum().indexOf(removeNumb));
        for (int i = 0; i <getGetNum().size() ; i++) {
            int remove=getGetNum().get(i);
            getGetNum().set(i,(remove-removeNumb));
        }

        System.out.println("Число по индексу удалено.");
    }

    void findByNumb() {
        System.out.println("Введите значение которое хотите найти :");
        int findNum = scn.nextInt();
        System.out.println("Значение под номером " + findNum + " находится в индексе под номером:" + getGetNum().indexOf(findNum));
    }

    void findByIndex() {
        System.out.println("Введите индекс который хотите найти :");
        int findInd = scn.nextInt();
        System.out.println("Индекс под номером " + findInd + " находится значение:" + getGetNum().get(findInd));
    }

    void average() {
        Integer[] numOfList = new Integer[getGetNum().size()];
        numOfList = getGetNum().toArray(numOfList);
        int sum = 0;
        for (int i : numOfList) {
            sum += i;
        }
        sum /= numOfList.length;
        System.out.println("Среднее арифметическое всех чисел:" + sum);
    }

    void maxNumber() {
        Integer[] max = new Integer[getGetNum().size()];

        max = getGetNum().toArray(max);
        int lastNum = num - 1;
        Arrays.sort(max);
        System.out.println(max[lastNum]);
    }

    void minNumber() {
        Integer[] min = new Integer[getGetNum().size()];
        min = getGetNum().toArray(min);
        Arrays.sort(min);
        System.out.println(min[0]);
    }

}








