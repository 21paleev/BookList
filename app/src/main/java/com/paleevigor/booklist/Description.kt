package com.paleevigor.booklist
// Ветка creating_domain
//Создаем папки data, domain, presentation.
// В presentation перемещаем MainActivity.
// В domain создаем бизнес-логику:
// - сущность как дата класс с нужными полями BookItem,
// - юзкейсы (классы для работы с BookItem).
// В каждом юзкейсе создаем свою функцию без реализации.

// Ветка creating_domain_2
// В domain создаем репозиторий-интерфейс с функциями для юзкейсов.
// Добавляем репозиторий в конструктор юзкейсов как переменную экземпляра
// и в функцию юзкейса добавляем вызов соответствующей функции репозитория

// Ветка creating_data
// В data создаем класс реализации репозитория (Impl)
// Делаем этот класс Object (чтобы это был синглтон)
// Реализуем интерфейс, переопределяем все методы
// На начальном этапе храним все данные в коллекции переменных
// В переопределяемых методах прописываем реализацию для коллекции данных

// Ветка creating_presentation
// Создаем класс ViewModel
// В нем создаем переменные нужных юзкейсов и репозитория
// Создаем объект типа LiveData
// В MainActivity создаем обект LiveData
// и подписываемся на объект bookList
// Для проверки в репозиторииImpl в блоке init заполняем list

// Ветка creating_presentation_2
// Реализуем автообновление списка через LiveData
// в юзкейсах, репозитории и реализации делаем делаем возвращаемые значения типа LiveData
// в реализации создаем объект LiveData
// в реализации возвращаем этот объект
// создаем метод обновления LiveData и устанавливаем в необходимые методы
// во VM меняем присваивание переменной VM на метод юзкейса
// убираем ненужный метод получения листа и его вызовы (включая активити)

//ветка maket_list
// добавляем макеты для листа
