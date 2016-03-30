unit UfrmPrincipal;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, Menus, ComCtrls, ExtCtrls;

type
  TfrmPrincipal = class(TForm)
    MainMenu1: TMainMenu;
    Cadastro1: TMenuItem;
    Cliente1: TMenuItem;
    Fornecedor1: TMenuItem;
    funcionrio1: TMenuItem;
    Usurio1: TMenuItem;
    Produto1: TMenuItem;
    formadePagamento1: TMenuItem;
    CondiesdePagamento1: TMenuItem;
    Vendas1: TMenuItem;
    Pedido1: TMenuItem;
    Pesquisar1: TMenuItem;
    Compras1: TMenuItem;
    Pedido2: TMenuItem;
    Relatrios1: TMenuItem;
    Sair1: TMenuItem;
    stbDataHora: TStatusBar;
    Timer1: TTimer;
    procedure Timer1Timer(Sender: TObject);
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
  Const
  Meses :Array[1..12] of String =
    ('janeiro','fevereiro', 'março','abril', 'maio', 'junho',
     'julho', 'agosto', 'setembro', 'outubro', 'novembro', 'dezembro');
  Semana :Array[1..7] of String =
    ('Domingo','Segunda-Feira', 'Terça-Feira', 'Quarta-Feira',
      'Quinta-Feira', 'Sexta-Feira', 'Sábado');
  var
    dia, mes, ano, diaSem:Word;
  begin
    DecodeDate(date,ano,mes,dia);
    diaSem := DayofWeek(date);
    Result := Semana[diaSem] + ', ' + InttoStr(dia) + ' de ' + Meses[mes] +
              ' de ' + inttoStr(ano);
  end;


procedure TfrmPrincipal.Timer1Timer(Sender: TObject);
begin
  stbDataHora.Panels[0].Text := DatetoStr(date);//transforma uma data em string
  stbDataHora.Panels[1].Text := TimetoStr(time);//transforma a hora em string
  stbDataHora.Panels[2].Text := DataStatus;
end;

end.
