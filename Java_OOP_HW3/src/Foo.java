// Задание 2. Описать возможность построения экземпляра класса с больши́м количеством атрибутов
// Здравствуйте
/*
Хочу немного болтологии и мыслей своих сюда вылить...
Ах если бы это был python - я бы подумал как сделать универсальный конструктор, используя **kwargs.
Но, с удивлением для себя, обнаружил, что в Java такого нет( Есть какое-то подобие (кажется varargs) но
оно о другом и прикрутить не придумал как нормально.
С другой стороны благосфера интернета бурлит таким замечательным паттерном как Builder (куда ни зайди -
везде им машут) так что решил остановится на нем.
Но пока писал - нашел что-то похожее: паттерн Fluent Interface. Он оказался понятнее) Но билдер прорабатывается мной,
просто вне рамок ДЗ уже)
P.s.: ну и я уж сократил количество полей до 4-х вместо 7-ми... Логика то останется.
 */

public class Foo {
    int _arg1;
    String _arg2;
    double _arg3;
    int _arg4;

    public Foo() { }

//    public Foo(int arg1, String arg2, double arg3, int arg4) {
//    }

//    public Foo buildFoo()
//    {
//        return new Foo(_arg1, _arg2, _arg3, _arg4);
//    }

    public Foo arg1(int _arg1)
    {
        this._arg1 = _arg1;
        return this;
    }

    public Foo arg2(String _arg2)
    {
        this._arg2 = _arg2;
        return this;
    }

    public Foo arg3(double _arg3)
    {
        this._arg3 = _arg3;
        return this;
    }

    public Foo arg4(int _arg4)
    {
        this._arg4 = _arg4;
        return this;
    }
}
