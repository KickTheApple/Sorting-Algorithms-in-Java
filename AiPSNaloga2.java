import java.util.Arrays;
import java.util.Scanner;

public class AiPSNaloga2 {

    public static void main(String[] args) {

        izvajanje();

    }

    static void izvajanje() {

        Scanner bralnik = new Scanner(System.in);
        String ukaz = bralnik.nextLine();

        String[] razbitUkaz = ukaz.split(" ");

        boolean nacinStetja;
        boolean narascanje;

        nacinStetja = razbitUkaz[0].equalsIgnoreCase("count");
        narascanje = razbitUkaz[2].equalsIgnoreCase("up");

        int[] podatkiStevil = Arrays.stream(bralnik.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] vrnjeniPodatki;

        switch (razbitUkaz[1]) {

            case("insert"):
                if (nacinStetja) {
                    vrnjeniPodatki = algoritem.insert(podatkiStevil, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.insert(vrnjeniPodatki, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.insert(vrnjeniPodatki, nacinStetja, !narascanje);
                } else {
                    algoritem.insert(podatkiStevil, nacinStetja, narascanje);
                }
                break;

            case("select"):
                if (nacinStetja) {
                    vrnjeniPodatki = algoritem.select(podatkiStevil, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.select(vrnjeniPodatki, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.select(vrnjeniPodatki, nacinStetja, !narascanje);
                } else {
                    algoritem.select(podatkiStevil, nacinStetja, narascanje);
                }
                break;

            case("bubble"):
                if (nacinStetja) {
                    vrnjeniPodatki = algoritem.bubble(podatkiStevil, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.bubble(vrnjeniPodatki, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.bubble(vrnjeniPodatki, nacinStetja, !narascanje);
                } else {
                    algoritem.bubble(podatkiStevil, nacinStetja, narascanje);
                }
                break;

            case("heap"):
                if (nacinStetja) {
                    vrnjeniPodatki = algoritem.heap(podatkiStevil, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.heap(vrnjeniPodatki, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.heap(vrnjeniPodatki, nacinStetja, !narascanje);
                } else {
                    algoritem.heap(podatkiStevil, nacinStetja, narascanje);
                }
                break;

            case("merge"):
                if (nacinStetja) {
                    vrnjeniPodatki = algoritem.merge(podatkiStevil, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.merge(vrnjeniPodatki, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.merge(vrnjeniPodatki, nacinStetja, !narascanje);
                } else {
                    algoritem.merge(podatkiStevil, nacinStetja, narascanje);
                }
                break;

            case("quick"):
                if (nacinStetja) {
                    vrnjeniPodatki = algoritem.quick(podatkiStevil, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.quick(vrnjeniPodatki, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.quick(vrnjeniPodatki, nacinStetja, !narascanje);
                } else {
                    algoritem.quick(podatkiStevil, nacinStetja, narascanje);
                }
                break;

            case("radix"):
                if (nacinStetja) {
                    vrnjeniPodatki = algoritem.radix(podatkiStevil, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.radix(vrnjeniPodatki, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.radix(vrnjeniPodatki, nacinStetja, !narascanje);
                } else {
                    algoritem.radix(podatkiStevil, nacinStetja, narascanje);
                }
                break;

            case("bucket"):
                if (nacinStetja) {
                    vrnjeniPodatki = algoritem.bucket(podatkiStevil, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.bucket(vrnjeniPodatki, nacinStetja, narascanje);
                    System.out.print(" | ");
                    algoritem.bucket(vrnjeniPodatki, nacinStetja, !narascanje);
                } else {
                    algoritem.bucket(podatkiStevil, nacinStetja, narascanje);
                }
                break;

        }

    }

}

abstract class algoritem {

    static int zamenjave;
    static int primerjave;

    static void izpisnikTrace(int[] data, int sortedLine) {

        for (int x = 0; x < data.length; x++) {

            if (x + 1 < data.length) {

                System.out.print(data[x] + " ");

            } else {

                System.out.print(data[x]);

            }

            if (sortedLine == x) {

                System.out.print(x + 1 < data.length ? "| " : " |");

            }

        }

        System.out.println();

    }



    static void izpisnikTraceQuick(int[] data, int sortedIndex) {

        for (int x = 0; x < data.length; x++) {

            if (sortedIndex == x) {

                System.out.print(x + 1 < data.length ? "| " : "| ");

            }

            if (x + 1 < data.length) {

                System.out.print(data[x] + " ");

            } else {

                System.out.print(data[x]);

            }

            if (sortedIndex == x) {

                System.out.print(x + 1 < data.length ? "| " : " |");

            }

        }

        System.out.println();

    }

    static boolean compareTo(int previous, int trenutnik, boolean narascanje) {

        primerjave++;
        if (narascanje) {

            return previous > trenutnik;

        } else {

            return previous < trenutnik;

        }

    }

    static void exchange(int[] data, int index, int stuff) {

        zamenjave++;
        data[index] = stuff;

    }

    static void swapper(int[] data, int index1, int index2) {

        int hramba = data[index1];
        data[index1] = data[index2];
        data[index2] = hramba;
        zamenjave += 3;

    }

    static int[] insert(int[] data, boolean nacinStetja, boolean narascanje) {

        if (!nacinStetja) {
            izpisnikTrace(data,-1);
        }
        zamenjave = 0;
        primerjave = 0;
        for (int i = 1; i < data.length; i++) {

            int original = data[i];
            int trenutniJ = -1;
            zamenjave++;

            for (int j = i - 1; j >= 0; j--) {

                trenutniJ = j;

                if (compareTo(data[j], original, narascanje)) {

                    exchange(data, j+1, data[j]);
                    trenutniJ = -1;

                } else {

                    break;

                }

            }

            exchange(data, trenutniJ+1, original);

            if(!nacinStetja) {
                izpisnikTrace(data, i);
            }
        }

        if (nacinStetja) {
            System.out.printf("%d ", zamenjave);
            System.out.printf("%d", primerjave);
        }
        return data;

    }

    static int[] select(int[] data, boolean nacinStetja, boolean narascanje) {

        if (!nacinStetja) {
            izpisnikTrace(data, -1);
        }
        zamenjave = 0;
        primerjave = 0;
        for (int i = 0; i < data.length-1; i++) {

            int minimumValue = data[i];
            int minIndex = i;

            for (int j = i+1; j < data.length; j++) {

                // TODO nadomesti bodi if s compareTO()

                if (compareTo(data[j], minimumValue, !narascanje)) {

                    minIndex = j;
                    minimumValue = data[j];

                }

            }

            swapper(data, i, minIndex);

            if (!nacinStetja) {
                izpisnikTrace(data, i);
            }

        }

        if (nacinStetja) {
            System.out.printf("%d ", zamenjave);
            System.out.printf("%d", primerjave);
        }

        return data;

    }

    static int[] bubble(int[] data, boolean nacinStetja, boolean narascanje) {

        if (!nacinStetja) {
            izpisnikTrace(data, -1);
        }
        zamenjave = 0;
        primerjave = 0;
        int tockaUrejenosti = 0;

        for (int i = 0; i < data.length; i++) {

            int trenutnaTocka = data.length-1;
            boolean sortirano = true;

            for (int j = data.length-1; j > tockaUrejenosti; j--) {

                if (compareTo(data[j-1], data[j], narascanje)) {

                    swapper(data, j-1, j);
                    trenutnaTocka = j;
                    sortirano = false;

                }

            }

            tockaUrejenosti = trenutnaTocka;

            if (!nacinStetja) {
                izpisnikTrace(data, tockaUrejenosti-1);
            }

            if (sortirano || tockaUrejenosti + 1 == data.length) {
                break;
            }

        }

        if (nacinStetja) {
            System.out.printf("%d ", zamenjave);
            System.out.printf("%d", primerjave);
        }
        return data;

    }

    static int[] heap(int[] data, boolean nacinStetja, boolean narascanje) {

        if (!nacinStetja) {
            izpisnikTrace(data, -1);
        }

        int najDednikIndex;
        int oce;
        zamenjave = 0;
        primerjave = 0;

        for (int i = data.length / 2 - 1; i >= 0; i--) {

            oce = i;

            while (2 * oce + 1 < data.length) {

                najDednikIndex = 2 * oce + 1;

                if (2 * oce + 2 < data.length && compareTo(data[2 * oce + 1], data[2 * oce + 2], !narascanje)) {

                    najDednikIndex = 2 * oce + 2;

                }

                if (compareTo(data[oce], data[najDednikIndex], !narascanje)) {

                    swapper(data, oce, najDednikIndex);

                } else {

                    break;

                }

                oce = najDednikIndex;

            }

        }

        if (!nacinStetja) {
            izpisnikTrace(data, data.length-1);
        }

        for (int i = 1; i < data.length; i++) {

            swapper(data, 0, data.length-i);
            oce = 0;

            while (2 * oce + 1 < data.length-i) {

                najDednikIndex = 2 * oce + 1;

                if (2 * oce + 2 < data.length-i && compareTo(data[2 * oce + 1], data[2 * oce + 2], !narascanje)) {

                    najDednikIndex = 2 * oce + 2;

                }

                if (compareTo(data[oce], data[najDednikIndex], !narascanje)) {

                    swapper(data, oce, najDednikIndex);

                } else {

                    break;

                }

                oce = najDednikIndex;

            }

            if (!nacinStetja) {
                izpisnikTrace(data, data.length-i-1);
            }

        }

        if (nacinStetja) {
            System.out.printf("%d ", zamenjave);
            System.out.printf("%d", primerjave);
        }

        return data;

    }

    static void pridobitev(int[] data, int left, int right, boolean nacinStetja, boolean narascanje) {

        if (left < right) {

            if (!nacinStetja) {
                izpisnikTrace(Arrays.copyOfRange(data, left, right+1), (right - left) / 2);
            }

            pridobitev(data, left, left + (right - left) / 2, nacinStetja, narascanje);
            pridobitev(data, left + (right - left) / 2 + 1, right, nacinStetja, narascanje);


            int[] subArrayL = new int[(right - left + 1) / 2 + (right - left + 1) % 2];
            int[] subArrayR = new int[(right - left + 1) / 2];

            for (int i = 0 ; i < subArrayL.length; i++) {

                subArrayL[i] = data[left + i];
                zamenjave++;

            }

            for (int i = 0; i < subArrayR.length; i++) {

                subArrayR[i] = data[left + (right - left) / 2 + 1 + i];
                zamenjave++;

            }

            int indexLeft = 0;
            int indexRight = 0;
            int counter = 0;

            while(indexLeft < subArrayL.length && indexRight < subArrayR.length) {

                if (compareTo(subArrayL[indexLeft], subArrayR[indexRight], narascanje)) {

                    data[left + counter] = subArrayR[indexRight];
                    indexRight++;

                } else {

                    data[left + counter] = subArrayL[indexLeft];
                    indexLeft++;

                }

                zamenjave++;
                counter++;

            }

            for (int i = counter; i < subArrayL.length + subArrayR.length; i++) {

                if (indexLeft < subArrayL.length) {

                    data[left+i] = subArrayL[indexLeft];
                    indexLeft++;

                } else {

                    data[left+i] = subArrayR[indexRight];
                    indexRight++;

                }

                zamenjave++;

            }

            if (!nacinStetja) {
                izpisnikTrace(Arrays.copyOfRange(data, left, right+1), -1);
            }

        }

    }

    static int[] merge(int[] data, boolean nacinStetja, boolean narascanje) {

        zamenjave = 0;
        primerjave = 0;

        if (!nacinStetja) {
            izpisnikTrace(data, -1);
        }

        pridobitev(data, 0, data.length-1, nacinStetja, narascanje);

        if (nacinStetja) {
            System.out.printf("%d ", zamenjave);
            System.out.printf("%d", primerjave);
        }

        return data;

    }

    static void pivoter(int[] data, int pivotIndex, int zadnjiIndex, boolean nacinStetja, boolean narascanje) {

        if (pivotIndex < zadnjiIndex) {

            int levicar = pivotIndex + 1;
            int desnicar = zadnjiIndex;

            int vrednostPivot = data[pivotIndex];
            zamenjave++;
            primerjave++;

            boolean nastavljenLevicar = false;
            boolean nastavljenDesnicar = false;

            while (levicar <= desnicar) {

                if (!nastavljenLevicar && !compareTo(vrednostPivot, data[levicar], narascanje)) {

                    nastavljenLevicar = true;

                } else if (!nastavljenLevicar) {

                    levicar++;

                }

                if (!nastavljenDesnicar && !compareTo(vrednostPivot, data[desnicar], !narascanje)) {

                    nastavljenDesnicar = true;

                } else if (!nastavljenDesnicar) {

                    desnicar--;

                }

                if (nastavljenLevicar && nastavljenDesnicar) {

                    if (levicar != desnicar) {

                        swapper(data, levicar, desnicar);
                        levicar++;
                        desnicar--;

                    } else {

                        levicar++;

                    }

                    nastavljenLevicar = false;
                    nastavljenDesnicar = false;

                }

            }

            swapper(data, pivotIndex, desnicar);
            int premaknjenPivot = desnicar;

            if (!nacinStetja) {
                izpisnikTraceQuick(Arrays.copyOfRange(data, pivotIndex, zadnjiIndex+1), premaknjenPivot - pivotIndex);
            }

            pivoter(data, pivotIndex, premaknjenPivot-1, nacinStetja, narascanje);
            pivoter(data, premaknjenPivot+1, zadnjiIndex, nacinStetja, narascanje);

        }

    }

    static int[] quick(int[] data, boolean nacinStetja, boolean narascanje) {

        zamenjave = 0;
        primerjave = 0;

        if (!nacinStetja) {
            izpisnikTrace(data, -1);
        }

        pivoter(data, 0, data.length-1, nacinStetja, narascanje);

        if (!nacinStetja) {
            izpisnikTrace(data, -1);
        }

        if (nacinStetja) {
            System.out.printf("%d ", zamenjave);
            System.out.printf("%d", primerjave);
        }

        return data;

    }

    static int[] radixCountSort(int[] data, int ntaCifra, boolean nacinStetja, boolean narascanje) {

        int maximumValue = -1;
        for (int i = 0; i < data.length; i++) {

            int cifrica = (data[i] / (int) Math.pow(10, ntaCifra)) % 10;
            zamenjave++;

            if (compareTo(maximumValue, cifrica, false)) {

                maximumValue = cifrica;

            }

        }

        int[] pojavitve = new int[maximumValue + 1];

        for (int i = 0; i < data.length; i++) {

            int vrednost = data[i];

            int cifrica = (vrednost / (int) Math.pow(10, ntaCifra)) % 10;
            pojavitve[cifrica]++;

        }

        int[] newDataIndexed = new int[pojavitve.length];
        int indexedLocation = 0;

        if (narascanje) {

            for (int i = 0; i < pojavitve.length; i++) {

                indexedLocation += pojavitve[i];
                newDataIndexed[i] = indexedLocation;

            }

        } else {

            for (int i = pojavitve.length-1; i >= 0; i--) {

                indexedLocation += pojavitve[i];
                newDataIndexed[i] = indexedLocation;

            }

        }

        int[] newData = new int[data.length];

        for (int i = 0; i < data.length; i++) {

            zamenjave++;
            primerjave++;

            int vrednost = data[i];
            int cifrica = (vrednost / (int) Math.pow(10, ntaCifra)) % 10;

            newData[newDataIndexed[cifrica] - pojavitve[cifrica]] = vrednost;
            pojavitve[cifrica]--;

        }

        return newData;

    }

    static int[] radix(int[] data, boolean nacinStetja, boolean narascanje) {

        int largestNumberSize = 0;
        zamenjave = 0;
        primerjave = 0;

        if (!nacinStetja) {
            izpisnikTrace(data, -1);
        }

        for (int i = 0; i < data.length; i++) {

            if (largestNumberSize < String.valueOf(data[i]).length()) {

                largestNumberSize = String.valueOf(data[i]).length();

            }

        }

        for (int i = 0; i < largestNumberSize; i++) {

            data = radixCountSort(data, i, nacinStetja, narascanje);

            if (!nacinStetja) {
                izpisnikTrace(data, -1);
            }

        }

        if (nacinStetja) {
            System.out.printf("%d ", zamenjave);
            System.out.printf("%d", primerjave);
        }

        return data;

    }

    static void insertBukirat(int[] data, boolean nacinStetja, boolean narascanje) {

        for (int i = 1; i < data.length; i++) {

            int original = data[i];
            int trenutniJ = -1;
            zamenjave++;

            for (int j = i - 1; j >= 0; j--) {

                trenutniJ = j;

                if (compareTo(data[j], original, narascanje)) {

                    exchange(data, j+1, data[j]);
                    trenutniJ = -1;

                } else {

                    break;

                }

            }

            exchange(data, trenutniJ+1, original);

            if(!nacinStetja) {
                izpisnikTrace(data, i);
            }

        }

    }


    static int[] bucket(int[] data, boolean nacinStetja, boolean narascanje) {

        zamenjave = 0;
        primerjave = 0;

        if (!nacinStetja) {
            izpisnikTrace(data,-1);
        }

        int minimum = data[0];
        int maximum = data[0];
        int steviloKosev = data.length / 2;

        for (int i = 0; i < data.length; i++) {

            int trenutnaData = data[i];
            zamenjave++;
            primerjave+=2;

            if (maximum < trenutnaData) {

                maximum = trenutnaData;

            }

            if (minimum > trenutnaData) {

                minimum = trenutnaData;

            }

        }

        int[][] kosi = new int[steviloKosev][data.length];
        int[] lokacijeKosaric = new int[steviloKosev];
        int razdaljaMinMax = maximum - minimum + 1;
        int razdelitevMinMax = razdaljaMinMax / steviloKosev;

        for (int i = 0; i < data.length; i++) {

            int vrednost = data[i];
            int kosaricaElementa;
            zamenjave++;
            primerjave++;

            if (narascanje) {

                kosaricaElementa = (vrednost - minimum - 1) / razdelitevMinMax;

                if (kosaricaElementa == kosi.length) {

                    kosaricaElementa--;

                }

            } else {

                kosaricaElementa = (maximum - vrednost - 1) / razdelitevMinMax;

                if (kosaricaElementa == kosi.length) {

                    kosaricaElementa--;

                }

            }

            kosi[kosaricaElementa][lokacijeKosaric[kosaricaElementa]] = vrednost;
            lokacijeKosaric[kosaricaElementa]++;

        }

        if (!nacinStetja) {

            for (int i = 0; i < kosi.length; i++) {

                if (i != kosi.length - 1) {

                    for (int j = 0; j < lokacijeKosaric[i]; j++) {

                        System.out.print(kosi[i][j] + " ");

                    }

                    System.out.print("| ");

                } else {

                    for (int j = 0; j < lokacijeKosaric[i]; j++) {

                        System.out.print(kosi[i][j] + " ");

                    }

                    System.out.println();

                }

            }

        }

        int indexiranje = 0;
        int[] zdruzeniBukicati = new int[data.length];
        for (int i = 0; i < kosi.length; i++) {

            for (int j = 0; j < lokacijeKosaric[i]; j++) {

                zdruzeniBukicati[indexiranje] = kosi[i][j];
                indexiranje++;

            }

        }

        insertBukirat(zdruzeniBukicati, nacinStetja, narascanje);

        if (nacinStetja) {
            System.out.printf("%d ", zamenjave);
            System.out.printf("%d", primerjave);
        }

        return zdruzeniBukicati;

    }

}