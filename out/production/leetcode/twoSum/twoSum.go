package main

func twoSum(nums []int, target int) []int {

	//Cria um mapa de int, int
	mapa := make(map[int]int)

	//Itera sobre o mapa
	for i := 0; i < len(nums); i++ {

		//Aqui nos pensamos em um complemento que sera o valor atual da lista recebida - o alvo
		complemento := target - nums[i]

		//Verificamos se o complemento esta no mapa
		//Se estiver retornamos o seu indice e o indice da iteracao atual numa lista
		if index, existe := mapa[complemento]; existe {
			return []int{index, i}
		}
		//Se nao adicionamos no mapa o valor de nuns em i e seu indice no mapa
		//A sintaxe significa: mapa[chave] = valor, mapa na chave tal, recebe valor tal.
		mapa[nums[i]] = i
	}
	//Se nao tem solucao retorna nil
	return nil
}
