# libNeuronNetw
Neuron network lib

# ENG
## Info
An ordinary perceptron.
Function activation - ReLu (modifided)

## Class Network
```java
Network netw = new Network(2, 2, 1); //3 layers, input(2), hidden(2), ... , output(1)
Thread thread = netw.train(LearnDataSet); //training network on DataSet, return Thread
netw.query(double[]); //query network, return double[]

netw.saveToFile(File); //save network to file
Network netw2 = Network.loadFromFile(File); //load network from file
```

## Class LearnDataSet
```java
LearnDataSet lds = new LearnDataSet(); //create LearnDataSet
lds.addData(double[], double[]); //add data, input - output
```

## Utils
```java
NetworkUtil.imageToData(BufferedImage img, int wightStep, int heightStep); //return image to double[]
```


# RUS
## Информация
Обычный перцептрон
Функция активации - ReLu (модифицированная)

## Класс Network
```java
Network netw = new Network(2, 2, 1); //3 слоя, вход(2), скрытый(2), ... , выход(1)
Thread thread = netw.train(LearnDataSet); //тренерует сеть на DataSet, вернет Thread
netw.query(double[]); //опрашивает сеть, вернет double[]

netw.saveToFile(File); //сохраняет сеть в файл
Network netw2 = Network.loadFromFile(File); //загружает сеть из файла
```

## Класс LearnDataSet
```java
LearnDataSet lds = new LearnDataSet(); //создает LearnDataSet
lds.addData(double[], double[]); //добавить данные, вход - выход
```

## Инструменты
```java
NetworkUtil.imageToData(BufferedImage img, int wightStep, int heightStep); //вернет картинку в double[]
```