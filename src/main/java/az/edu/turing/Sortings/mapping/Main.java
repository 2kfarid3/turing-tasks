package az.edu.turing.Sortings.mapping;

public class Main {
    public static void main(String[] args) {
        String string = "shammad";
        int[] harfSayisi = new int[26]; // Harflerin frekansını tutacak dizi

        // Büyük ve küçük harfleri tek tip yapmak için metni küçük harfe çeviriyoruz
        string = string.toLowerCase();

        // Her harfin kaç kez geçtiğini sayıyoruz
        for (int i = 0; i < string.length(); i++) {
            char suankiHarf = string.charAt(i);
            if (suankiHarf >= 'a' && suankiHarf <= 'z') {
                int index = suankiHarf - 'a'; // Harfe göre indeks hesaplanıyor
                harfSayisi[index]++;
            }
        }

        // Sonucu ekrana yazdırıyoruz
        for (int i = 0; i < harfSayisi.length; i++) {
            if (harfSayisi[i] > 0) {
                char harf = (char) (i + 'a');
                System.out.println(harf + ": " + harfSayisi[i]);
            }
        }
    }
}

