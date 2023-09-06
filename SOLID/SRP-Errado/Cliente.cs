using System.Net.Mail;
namespace EP.SOLID.SRP.Violacao
    0 references
     public class Cliente
     {
        0 references
         public int ClienteId { get; set; }
         1 reference
         public string Nome { get; set; }
         3 references
         public string Email { get; set; }
         2 references
         public string CPF { get; set; }
         1 reference
         public DateTime DataCadastro { get; set; }
         0 references
         public string AdicionarCliente()
         {
             if (!Email. Contains ("@"))
                 return "Cliente com e-mail inválido";
             if (CPF.Length != 11)
                 return "Cliente com CPF inválido";
