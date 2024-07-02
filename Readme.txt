В классе Calculator создайте метод calculateDiscount, 
который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки. 
Ваша задача - проверить этот метод с использованием библиотеки AssertJ. 
Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException. 
Не забудьте написать тесты для проверки этого поведения




testCalculateDiscount_validArguments: Проверяет корректный расчет скидки при валидных аргументах.
testCalculateDiscount_zeroDiscount: Проверяет случай, когда процент скидки равен 0.
testCalculateDiscount_fullDiscount: Проверяет случай, когда процент скидки равен 100.
testCalculateDiscount_negativePurchaseAmount: Проверяет выброс исключения при отрицательной сумме покупки.
testCalculateDiscount_negativeDiscountPercentage: Проверяет выброс исключения при отрицательном проценте скидки.
testCalculateDiscount_discountPercentageAbove100: Проверяет выброс исключения при проценте скидки больше 100.