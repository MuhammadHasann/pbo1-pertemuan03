package percabangan;

public class SwitchCondition {
    public static void main(String[] args) {
        int uang = 100000;
        switch (uang){
            case 1000:
                System.out.println("plgn : \"murahnya ae cil, palsu nih\"");
                System.out.println("acil : \"ada harga, ada kualitas bre\"");
                break;
            case 3000:
                System.out.println("plgn : \"ragu ulun nah lawan jualan pian cil ae, murah pang\"");
                System.out.println("acil : \"ehh napa maksud nyawa, nyawa kira palsu kah barang nda\"");
                break;
            case 5000:
                System.out.println("plgn : \"angsul cil 4900\"");
                System.out.println("acil : \"bongonya ngini pas waluh ae\"");
                break;
            default:
                System.out.println("plgn : \"cil bisa kurang kah\"");
                System.out.println("acil : \"kada kawa, harga pas sudah\"");
                System.out.println("plgn : \"mun piannya pang cil, kawa kurang kah jujuran. hehehehe....");
                System.out.println("acil : \"behapal nda sudah belaki!!!\"");
                break;
        }
    }
}
