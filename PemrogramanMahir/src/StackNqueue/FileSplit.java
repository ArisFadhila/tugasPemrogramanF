package StackNqueue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
    public class FileSplit {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                String fileName = "Test.txt";

                System.out.print("Masukkan ukuran potongan (dalam karakter): ");
                int chunkSize = scanner.nextInt();

                Queue<String> chunks = splitFileIntoChunks(fileName, chunkSize);

                System.out.println("\nBagian-bagian dari file:");
                while (!chunks.isEmpty()) {
                    System.out.println(chunks.poll());
                }

                scanner.close();
            }
            private static Queue<String> splitFileIntoChunks(String fileName, int chunkSize) {
                Queue<String> chunks = new LinkedList<>();
                StringBuilder currentChunk = new StringBuilder();

                try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        for (int i = 0; i < line.length(); i++) {
                            currentChunk.append(line.charAt(i));

                            if (currentChunk.length() == chunkSize) {
                                chunks.add(currentChunk.toString());
                                currentChunk.setLength(0);
                            }
                        }

                        if (currentChunk.length() > 0) {
                            chunks.add(currentChunk.toString());
                            currentChunk.setLength(0);
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
                }

                return chunks;
            }
        }