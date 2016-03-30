unit UdmCliente;

interface

uses
  SysUtils, Classes, FMTBcd, DB, SqlExpr;

type
  TdmCliente = class(TDataModule)
    sdsCadCliente: TSQLDataSet;
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  dmCliente: TdmCliente;

implementation

{$R *.dfm}

end.
