String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer"};
        List<String> oyuncular = Arrays.asList(atp);
 
        // Eski döngü yapısı
        for (String player : oyuncular) {
            System.out.print(player + "; ");
        }
 
        System.out.println();
        // Lambda kullanarak fonksiyonel kullan�lacakt�r.Deneme
        oyuncular.forEach((oyuncu) -> System.out.print(oyuncu + "; "));
 
        System.out.println();
        // Java 8'in çift iki nokta üst üste operatörüyle
        oyuncular.forEach(System.out::println);
