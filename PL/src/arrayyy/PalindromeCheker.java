package arrayyy;

import java.util.Scanner;

public class PalindromeCheker {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Masukkan string: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println("String \"" + input + "\" adalah palindrome.");
            } else {
                System.out.println("String \"" + input + "\" bukan palindrome.");
            }

            scanner.close();
        }

        public static boolean isPalindrome(String str) {
            // Ubah string menjadi huruf kecil dan hapus spasi
            str = str.toLowerCase().replaceAll("\\s", "");

            // Buat array karakter untuk menyimpan setiap karakter string
            char[] charArray = str.toCharArray();

            int left = 0;
            int right = charArray.length - 1;

            // Lakukan perbandingan karakter dari kedua arah
            while (left < right) {
                // Jika karakter pada posisi kiri tidak sama dengan karakter pada posisi kanan,
                // maka string bukan palindrome
                if (charArray[left] != charArray[right]) {
                    return false;
                }
                // Pindah ke karakter berikutnya
                left++;
                right--;
            }
            // Jika semua perbandingan berhasil, maka string adalah palindrome
            return true;
        }
    }
