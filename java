import java.util.Scanner;
public class Tip {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Burç tarihinizi gün  giriniz: ");
        int day = input.nextInt();

        System.out.println("Burç tarihinizi ay olarak  giriniz: ");
        int ay = input.nextInt();

        if (ay == 1) {
            if (day < 22) {
                System.out.print("Oğlak burcu");
            } else {
                System.out.print("Kova burcu");
            }
            if (ay == 2) {
                if (day < 20) {
                    System.out.print("Kova burcu");
                } else {
                    System.out.print("Balık burcu");
                }
                if (ay == 3) {
                    if (day < 21) {
                        System.out.print("Balık burcu");
                    }else {
                        System.out.print("Koç Burcu");
                    }
                    if (ay == 4) {
                        if (day < 21) {
                            System.out.print("Koç burcu");
                        }

                        else{
                            System.out.print("Boga burcu");
                        }
                        if (ay == 5) {
                            if (day < 22 && day <= 31) {
                                System.out.print("boğa burcu");
                            } else {
                                System.out.print("Ikizler");
                            }
                        } else if (ay == 6) {
                            if (day < 23 && day <= 31) {
                                System.out.print("Ikizler");
                            } else {
                                System.out.print("Yengec");
                            }
                        } else if (ay == 7) {
                            if (day < 23 && day <= 31) {
                                System.out.print("Yengec");
                            } else {
                                System.out.print("Aslan");
                            }
                        } else if (ay == 8) {
                            if (day < 23 && day <= 31) {
                                System.out.print("Aslan");
                            } else {
                                System.out.print("Basak");
                            }
                        } else if (ay == 9) {
                            if (day < 23 && day <= 31) {
                                System.out.print("Basak");
                            } else {
                                System.out.print("Terazi");
                            }
                        } else if (ay == 10) {
                            if (day < 23 && day <= 31) {
                                System.out.print("Terazi");
                            } else {
                                System.out.print("Akrep");
                            }
                        } else if (ay == 11) {
                            if (day < 22 && day <= 31) {
                                System.out.print("Akrep");
                            } else {
                                System.out.print("Yay");
                            }
                        } else if (ay == 12) {
                            if (day < 22 && day <= 31) {
                                System.out.print("Yay");
                            } else {
                                System.out.print("Oglak");
                            }
                        }

                    }
                }
            }
        }
    }
}

