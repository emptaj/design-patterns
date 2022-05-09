# Treść

Mamy tablicę Firm z NIPami. Za odpowiedni NIP dostajemy nagrody:
- jeżeli wszystkie cyfry są nieparzyste - 50zł
- jeżeli co najmniej połowa cyfr jest podzielna przez 3 - 100zł
- jeżeli NIP zawiera cyfry MMDD tego dnia (np. 1104) - 15zł
- jeżeli suma cyfr wynosi sumie dnia i miesiąca, pomnożonej razy 3 - 550zł
- jeżeli suma wartości bezwzględnych różnic między kolejnymi cyframi jest większa niż 50 - 200zł
- jeżeli Firma jest wyróżniona laurem Złota Firma - 30zł

Bonifikatą jest suma nagród. Należy pozwolić na określenie dla każdej z Firm holdingu jej bonifikaty. Dla Firm o przychodach większych od 100tys. pozwól określić status klienta jako wyróżniony laurem Złota Firma. Użyj wzorca Dekorator.

Wyświetl sumę nagród dla każdej z Firm używając dekoratora złożonego ze wszystkich możliwych klas dekorujących.
