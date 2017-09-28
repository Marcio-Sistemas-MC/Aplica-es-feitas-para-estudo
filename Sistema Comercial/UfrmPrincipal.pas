unit UfrmPrincipal;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, Menus, ComCtrls;

type
  TfrmPrincipal = class(TForm)
    MainMenu1: TMainMenu;
    CADASTRO1: TMenuItem;
    CLIENTE1: TMenuItem;
    FORNECEDOR1: TMenuItem;
    FUNCIONRIO1: TMenuItem;
    USURIO1: TMenuItem;
    PRODUTO1: TMenuItem;
    FORMADEPAGAMENTO1: TMenuItem;
    CONDIESDEPAGAMENTO1: TMenuItem;
    VENDAS1: TMenuItem;
    COMPRAS1: TMenuItem;
    RELATRIOS1: TMenuItem;
    SAIR1: TMenuItem;
    stbDataHora: TStatusBar;
  private
    { Private declarations }
  public
    { Public declarations }
    Function DataStatus: String;
  end;

var
  frmPrincipal: TfrmPrincipal;

implementation

{$R *.dfm}

{ TfrmPrincipal }

function TfrmPrincipal.DataStatus: String;
begin
  Const
    Meses :Array[1..12] of String =
      ('Janeiro','Fevereiro','Março','Abril',
       'Maio','Junho','Julho','Agosto',
       'Setembro','Outubro','Novembro','Dezebro');
   Semana :Array[1..7] of String =
      ('Domingo','Segunda-Feira','Terça-Feira',
       'Quarta-Feira','Quinta-Feira','Sexta-Feira','Sábado');
   var
     dia, mes, ano, diaSem:Word;
   begin
    decodeDate(date, ano, mes, dia);
    diaSem := DayofWeek(date);
    Result := Semana[diaSem] + ', ' + InttoStr(dia) +
              ' de ' + Meses[mes] + ' de ' + InttoStr(ano);
  end;
end;

end.
