fun main()
{
    print("Введите логин: ");
    val login = readLine();

    print("Введите пароль: ");
    val password = readLine();

    val message: String;

    if (login == "alex228")
    {
        if (password == "dmm041021")
        {
            message = "Доступ разрешен.";
        }
        else
        {
            message = "Доступ запрещен. Неверный пароль";
        }
    }
    else
    {
        message = "Доступ запрещен. Неверный логин.";
    }

    println(message);
}