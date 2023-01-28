package skypro.java.course2.lesson2;

public class Flower {
    /*
    * У класса flower есть следующие свойства:

- Цвет цветка (flowerColor);
- Страна происхождения (country);
- Стоимость (cost);
- Срок стояния, указанный в целых днях (lifeSpan).
* Цвет, страна происхождения и стоимость – данные, которые изменять нельзя,
* доступ к ним должен осуществляться только через геттеры и сеттеры.
* При этом если цвет цветка не указан или равен null, то по дефолту он должен быть белым.
* Если не указана страна происхождения или значение равно null, то значением по умолчанию будет считаться Россия.
* Стоимость цветка должна указываться в дробных числах с двумя знаками после запятой, например, 59,99 рублей.
* Цена не может быть отрицательной или равной нулю, в противном случае она должна быть равно 1 рублю.
* Срок стояния пользователь может указывать сам, но это значение может быть только целочисленным
* и только положительным числом. Если срок не указан, то значением по умолчанию будет считаться 3 дня.

Добавьте следующие объекты в данных класс:

- Роза обыкновенная из Голландии, стоимость штуки – 35,59 рублей
- Хризантема, стоимость штуки – 15 рублей, срок стояния – 5 дней
- Пион из Англии, стоимость штуки – 69,9 рублей, срок стояния – 1 день
- Гипсофила, страна происхождения – Турция, стоимость штуки – 19,5 рублей, срок стояния – 10 дней
* Напишите программу, которая выводит информацию по каждому цветку со всеми данными:
* названием, страной происхождения, стоимостью и сроком стояния цветка.
     */
    private String flower;
    private String flowerColor;
    private String country;
    private float cost;
    private final int lifeSpan;
    private final String DEFAULT_FLOWER = "Ромашка";
    private final String DEFAULT_COLOR = "белый";
    private final String DEFAULT_COUNTRY = "Россия";

    public Flower(String flower, String flowerColor, String country, float cost, int lifeSpan) {
        this.flower = (flower != null && !flower.isEmpty() && !flower.isBlank()) ? flower : DEFAULT_FLOWER;
        this.flowerColor = (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) ? flowerColor : DEFAULT_COLOR;
        this.country = (country != null && !country.isEmpty() && !country.isBlank()) ? country : DEFAULT_COUNTRY;
        this.cost = (cost >= 0) ? cost : 1f;
        this.lifeSpan = (lifeSpan > 0) ? lifeSpan : 3;
    }

    @Override
    public String toString() {
        return String.format("%s, цвет: %s, страна: %s, цена: %.2f рублей, срок стояния %d.", flower, flowerColor,
                country, cost, lifeSpan);
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = (flower != null && !flower.isEmpty() && !flower.isBlank()) ? flower : DEFAULT_FLOWER;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) ? flowerColor : DEFAULT_COLOR;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = (country != null && !country.isEmpty() && !country.isBlank()) ? country : DEFAULT_COUNTRY;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = (cost >= 0) ? cost : 1f;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

}
