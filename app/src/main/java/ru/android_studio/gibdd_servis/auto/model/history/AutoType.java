package ru.android_studio.gibdd_servis.auto.model.history;

/**
 * Crea(",ted by yurya(",ndreev on 20/09/16.
 */
public enum AutoType {

    a01("01", "Грузовые автомобили бортовые"),
    a02("02", "Грузовые автомобили шасси"),
    a03("03", "Грузовые автомобили фургоны"),
    a04("04", "Грузовые автомобили тягачи седельные"),
    a05("05", "Грузовые автомобили самосвалы"),
    a06("06", "Грузовые автомобили рефрижераторы"),
    a07("07", "Грузовые автомобили цистерны"),
    a08("08", "Грузовые автомобили с гидроманипулятором"),
    a09("09", "Грузовые автомобили прочие"),
    a21("21", "Легковые автомобили универсал"),
    a22("22", "Легковые автомобили комби (хэтчбек)"),
    a23("23", "Легковые автомобили седан"),
    a24("24", "Легковые автомобили лимузин"),
    a25("25", "Легковые автомобили купе"),
    a26("26", "Легковые автомобили кабриолет"),
    a27("27", "Легковые автомобили фаэтон"),
    a28("28", "Легковые автомобили пикап"),
    a29("29", "Легковые автомобили прочие"),
    a41("41", "Автобусы длиной не более 5 м"),
    a42("42", "Автобусы длиной более 5 м, но не более 8 м"),
    a43("43", "Автобусы длиной более 8 м, но не более 12 м"),
    a44("44", "Автобусы сочлененные длиной более 12 м"),
    a49("49", "Автобусы прочие"),
    a51("51", "Специализированные автомобили автоцистерны"),
    a52("52", "Специализированные автомобили санитарные"),
    a53("53", "Специализированные автомобили автокраны"),
    a54("54", "Специализированные автомобили заправщики"),
    a55("55", "Специализированные автомобили мастерские"),
    a56("56", "Специализированные автомобили автопогрузчики"),
    a57("57", "Специализированные автомобили эвакуаторы"),
    a58("58", "Специализированные пассажирские транспортные средства"),
    a59("59", "Специализированные автомобили прочие"),
    a71("71", "Мотоциклы"),
    a72("72", "Мотороллеры и мотоколяски"),
    a73("73", "Мотовелосипеды и мопеды"),
    a74("74", "Мотонарты"),
    a80("80", "Прицепы самосвалы"),
    a81("81", "Прицепы к легковым автомобилям"),
    a82("82", "Прицепы общего назначения к грузовым автомобилям"),
    a83("83", "Прицепы цистерны"),
    a84("84", "Прицепы тракторные"),
    a85("85", "Прицепы вагоны-дома передвижные"),
    a86("86", "Прицепы со специализированными кузовами"),
    a87("87", "Прицепы трейлеры"),
    a88("88", "Прицепы автобуса"),
    a89("89", "Прицепы прочие"),
    a91("91", "Полуприцепы с бортовой платформой"),
    a92("92", "Полуприцепы самосвалы"),
    a93("93", "Полуприцепы фургоны"),
    a95("95", "Полуприцепы цистерны"),
    a99("99", "Полуприцепы прочие"),
    a31("31", "Трактора"),
    a32("32", "Самоходные машины и механизмы"),
    a33("33", "Трамваи"),
    a34("34", "Троллейбусы"),
    a35("35", "Велосипеды"),
    a36("36", "Гужевой транспорт"),
    a38("38", "Подвижной состав железных дорог"),
    a39("39", "Иной");

    public static AutoType getByTypeNumberString(String typeNum) {
        if (typeNum == null || typeNum.isEmpty()) {
            return null;
        }

        for (AutoType autoType : values()) {
            if (autoType.getTypeNum().equals(typeNum))
                return autoType;
        }
        return null;
    }

    private final String typeNum;
    private final String text;

    AutoType(String typeNum, String text) {
        this.typeNum = typeNum;
        this.text = text;
    }

    public String getTypeNum() {
        return typeNum;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "AutoType{" +
                "typeNum='" + typeNum + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}