String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer"};
        List<String> oyuncular = Arrays.asList(atp);
 
        // Eski for dongusu
        for (String player : oyuncular) {
            System.out.print(player + "; ");
        }
 
        System.out.println();
        // Lambda kullanarak fonksiyonel kullanım
        oyuncular.forEach((oyuncu) -> System.out.print(oyuncu + "; "));
 
        System.out.println();
        // Java 8'in çift iki nokta üst üste operatörüyle
        oyuncular.forEach(System.out::println);
