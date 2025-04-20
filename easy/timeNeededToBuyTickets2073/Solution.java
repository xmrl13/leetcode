package easy.timeNeededToBuyTickets2073;


class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        // 6
        System.out.println(solution.timeRequiredToBuy(new int[]{2, 3, 2}, 2));
        // 8
        System.out.println(solution.timeRequiredToBuy(new int[]{5, 1, 1, 1}, 0));

    }

    public int timeRequiredToBuy(int[] tickets, int k) {

        // VERSÃO ANALITICA, RESOLVE O PROBLEMA MATEMÁTICAMENTE SEM SIMULAR O COMPORTAMENTO REAL
        var kTickets = tickets[k];
        var ticketsLength = tickets.length;
        var total = 0;

        for (int i = 0; i < ticketsLength; i++) {
            // verifica se i está "antes" de k ou se é o próprio k, e portanto tem a oportunidade de comprar todos os ingresos
            if (i <= k) {
                // i compra todos seus tickets pois é menor ou igual a tickets de k
                if (tickets[i] <= kTickets) {
                    total += tickets[i];
                }
                // i não comprará todos os tickets, consideramos até onde ele comprará que é igual a kTickets
                else {
                    total += kTickets;
                }
            }
            // i está "depois" de k
            else{
                // se i, após k, desejar comprar algo menor que kTickets, então compra todos tudo que deseja
                if(tickets[i] < kTickets){
                    total += tickets[i];
                }
                // se desejar comprar igual ou maior que k, então compra kTickets -1, pois não participa da ultima rodada
                // por estar atrás de k
                else{
                    total += kTickets -1;
                }
            }
        } return total;
    }

    // VERSÃO ITERATIVA, SIMULA O COMPORTAMENTO REAL
        /*
        var ticketsLength = tickets.length;
        var control = 0;

        for (int index = 0; tickets[k] != 0; index = (index + 1) % ticketsLength) {
            if (tickets[index] != 0) {
                tickets[index]--;
                control++;
            }
        }
        return control;
    }*/
}
