import 'dart:html';

void main() => runApp(MyApp());
class _MyAppState extends State<MyApp> {
  int number=0;
  @override
  void tekanTombol()
  {
  }
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: Text("Latihan Statefull Widget"),),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Text(number.toString()),
              RaisedButton(
                child: Text("Tambah Bilangan"),
                onPressed: tekanTombol,
              )
            ],
          ),
        ),
      ),
    );
  }
}
