# Treść

- obiekt klasy Temperature będzie co sekundę tworzył zdarzenia TemperatureChange z losową temperaturą w zakresie [-30:30] w st. C.

- obiekt klasy Wind będzie co sekundę tworzył zdarzenia WindChange z losową prędkością wiatru w zakresie [0:99] w km/h.

Obserwatorami będą obiekty klas :

- TemperatureAverage będzie nasłuchiwał zdarzeń o temperaturze i zapisywał w logach średnią ostatnich 5 pomiarów (lub mniej, jeśli będzie ich mniej)

- WindChill będzie nasłuchiwał zdarzeń o temperaturze i wietrze. Loguje on temperaturę odczuwalną, zatem jeśli jest wiatr, odejmie on od zmierzonej temperatury spodziewaną zmianę. Zakładamy, że różnicą będzie (ostatnia zanotowana siła wiatru/100) * 5 st. C.



