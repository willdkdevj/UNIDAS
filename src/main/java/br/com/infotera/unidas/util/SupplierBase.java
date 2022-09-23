/*
 * DOCUMENTAÇÃO DO FORNECEDOR: https://www.dotwconnect.com/interface/pt/documentation
 */
package br.com.infotera.unidas.util;

import br.com.infotera.common.ErrorException;
import br.com.infotera.common.WSIntegrador;
import br.com.infotera.common.enumerator.WSIntegracaoStatusEnum;
import br.com.infotera.common.enumerator.WSMensagemErroEnum;
import br.com.infotera.common.enumerator.WSPaxTipoEnum;
import br.com.infotera.common.enumerator.WSSexoEnum;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 *
 * @author William Dias
 */
@Component
public class SupplierBase {
    
    private static final Map<String, String> mapDestinations = new HashMap<>();

    public SupplierBase() {
        loadingDestinations();
    }
    /*
     * Padrões de siglas obtidas através da Organização Internacional para Padronização (ISO 3166) para códigos de países
     * https://pt.wikipedia.org/wiki/ISO_3166-1
    */
    public static Map<String, String> loadingDestinations(){
        mapDestinations.put("AF", "26"); 	// Afeganistão 	
        mapDestinations.put("CL", "110"); 	// Chile
        mapDestinations.put("ZA", "194"); 	// Africa do Sul 	
        mapDestinations.put("CN", "168"); 	// China
        mapDestinations.put("AL", "90"); 	// Albânia 	
        mapDestinations.put("CY", "106"); 	// Chipre
        mapDestinations.put("DE", "67"); 	// Alemanha 	
        mapDestinations.put("CO", "111"); 	// Colômbia
        mapDestinations.put("AD", "55"); 	// Andorra 	
        mapDestinations.put("KM", "211"); 	// Comores
        mapDestinations.put("AO", "200"); 	// Angola 	
        mapDestinations.put("CG", "210"); 	// Congo
        mapDestinations.put("AI", "151"); 	// Anguilla 	
        mapDestinations.put("CI", "106"); 	// Costa do Marfim
        mapDestinations.put("AQ", "295");     // Antartica 	
        mapDestinations.put("CR", "125"); 	// Costa Rica
        mapDestinations.put("AG", "137"); 	// Antígua e Barbuda 	
        mapDestinations.put("HR", "61"); 	// Croácia
        mapDestinations.put("AN", "255"); 	// Antilhas Holandesas 	
        mapDestinations.put("CU", "112"); 	// Cuba
        mapDestinations.put("SA", "4"); 	// Arábia Saudita 	
        mapDestinations.put("DK", "64"); 	// Dinamarca
        mapDestinations.put("DZ", "187"); 	// Argélia 	
        mapDestinations.put("DJ", "106"); 	// Djibuti
        mapDestinations.put("AR", "107"); 	// Argentina 	
        mapDestinations.put("DM", "142"); 	// Dominica
        mapDestinations.put("AM", "153"); 	// Armênia 	
        mapDestinations.put("EG", "7"); 	// Egito
        mapDestinations.put("AW", "138"); 	// Aruba 	
        mapDestinations.put("SV", "126"); 	// El Salvador
        mapDestinations.put("AU", "28"); 	// Austrália 	
        mapDestinations.put("AE", "6"); 	// Emirados Árabes Unidos
        mapDestinations.put("AT", "2"); 	// Áustria 	
        mapDestinations.put("EC", "114"); 	// Equador
        mapDestinations.put("AZ", "154"); 	// Azerbaidjão 	
        mapDestinations.put("ER", "5"); 	// Eritréia
        mapDestinations.put("BS", "108"); 	// Bahamas 	
        mapDestinations.put("BD", "19"); 	// Bangladesh 	
        mapDestinations.put("SK", "82"); 	// Eslováquia
        mapDestinations.put("BB", "139"); 	// Barbados 	
        mapDestinations.put("SI", "83"); 	// Eslovenia
        mapDestinations.put("BH", "6"); 	// Bareine 	
        mapDestinations.put("ES", "84"); 	// Espanha
        mapDestinations.put("BY", "57"); 	// Belarus 	
        mapDestinations.put("HI", "33"); 	// Havaí 	
        mapDestinations.put("US", "102"); 	// Estados Unidos da América
        mapDestinations.put("BE", "58"); 	// Bélgica 	
        mapDestinations.put("EE", "155"); 	// Estônia
        mapDestinations.put("BZ", "136"); 	// Belize 	
        mapDestinations.put("ET", "198"); 	// Etiópia
        mapDestinations.put("BX", "2"); 	// Benelux 	
        mapDestinations.put("RU", "160"); 	// Federação Russa
        mapDestinations.put("BJ", "201"); 	// Benin 	
        mapDestinations.put("FJ", "29"); 	// Fiji
        mapDestinations.put("BM", "103"); 	// Bermudas 	
        mapDestinations.put("PH", "174"); 	// Filipinas
        mapDestinations.put("BO", "124"); 	// Bolívia 	
        mapDestinations.put("FI", "65"); 	// Finlândia
        mapDestinations.put("BA", "59"); 	// Bósnia e Herzegóvina 	
        mapDestinations.put("FR", "66"); 	// França
        mapDestinations.put("BW", "202"); 	// Botswana 	
        mapDestinations.put("GA", "216"); 	// Gabão
        mapDestinations.put("BR", "109"); 	// Brasil 	
        mapDestinations.put("GM", "217"); 	// Gambia
        mapDestinations.put("BG", "60"); 	// Bulgária 	
        mapDestinations.put("GE", "156"); 	// Geórgia
        mapDestinations.put("BN", "166"); 	// Brunei Darussalam 	
        mapDestinations.put("GH", "218"); 	// Gana
        mapDestinations.put("BF", "203"); 	// Burkina Faso 	
        mapDestinations.put("GS", "405"); 	// Geórgia do Sul e Ilhas Sandwich do Sul
        mapDestinations.put("BI", "204"); 	// Burundi 	
        mapDestinations.put("GI", "68"); 	// Gibraltar
        mapDestinations.put("BT", "27"); 	// Butão 	
        mapDestinations.put("GD", "141"); 	// Granada
        mapDestinations.put("CV", "205"); 	// Cabo Verde 	
        mapDestinations.put("GR", "69"); 	// Grécia
        mapDestinations.put("CM", "206"); 	// Camarões 	
        mapDestinations.put("GL", "105"); 	// Groenlândia
        mapDestinations.put("KH", "167"); 	// Camboja 	
        mapDestinations.put("GP", "135"); 	// Guadalupe
        mapDestinations.put("CA", "100"); 	// Canadá 	
        mapDestinations.put("GU", "46"); 	// Guam
        mapDestinations.put("QA", "3"); 	// Catar 	
        mapDestinations.put("GT", "127"); 	// Guatemala 
        mapDestinations.put("KZ", "157"); 	// Cazaquistão	
        mapDestinations.put("GY", "145"); 	// Guiana
        mapDestinations.put("TD", "208"); 	// Chade	
        mapDestinations.put("GN", "219"); 	// Guine
        mapDestinations.put("GW", "220"); 	// Guiné Bissau 	
        mapDestinations.put("JO", "9"); 	// Jordânia
        mapDestinations.put("GQ", "215"); 	// Guine Equatorial 	
        mapDestinations.put("KI", "36"); 	// Kiribati
        mapDestinations.put("HT", "130"); 	// Haiti 	
        mapDestinations.put("KW", "2"); 	// Kuwait
        mapDestinations.put("NL", "77"); 	// Holanda 	
        mapDestinations.put("LA", "172"); 	// Laos
        mapDestinations.put("HN", "115"); 	// Honduras 	
        mapDestinations.put("LS", "189"); 	// Lesoto
        mapDestinations.put("HK", "169"); 	// Hong-Kong 	
        mapDestinations.put("LV", "189"); 	// Letônia
        mapDestinations.put("HU", "70"); 	// Hungria 	
        mapDestinations.put("LB", "10"); 	// Líbano
        mapDestinations.put("YE", "15"); 	// Iêmen 	
        mapDestinations.put("LR", "221"); 	// Libéria
        mapDestinations.put("BV", "315"); 	// Ilha Bouvet 	
        mapDestinations.put("LY", "190"); 	// Líbia
        mapDestinations.put("IM", "355"); 	// Ilha do Homem 	
        mapDestinations.put("LI", "92"); 	// Liechtenstein
        mapDestinations.put("CX", "52"); 	// Ilha Natal 	
        mapDestinations.put("LT", "74"); 	// Lituânia
        mapDestinations.put("NF", "42"); 	// Ilha Norfalk 	
        mapDestinations.put("LU", "75"); 	// Luxemburgo
        mapDestinations.put("KY", "149"); 	// Ilhas Cayman 	
        mapDestinations.put("MO", "185"); 	// Macau
        mapDestinations.put("CC", "53"); 	// Ilhas Cocos 	
        mapDestinations.put("MG", "199"); 	// Madagascar
        mapDestinations.put("CK", "35"); 	// Ilhas Cook 	
        mapDestinations.put("MY", "173"); 	// Malásia
        mapDestinations.put("GG", "2"); 	// Ilhas do Canal 	
        mapDestinations.put("MW", "222"); 	// Malawi
        mapDestinations.put("FO", "96"); 	// Ilhas Faroe 	
        mapDestinations.put("MV", "21"); 	// Maldivas
        mapDestinations.put("HM", "345"); 	// Ilhas Heard e McDonald 	
        mapDestinations.put("ML", "223"); 	// Mali
        mapDestinations.put("FK", "150"); 	// Ilhas Malvinas 	
        mapDestinations.put("MT", "76"); 	// Malta
        mapDestinations.put("MP", "43"); 	// Ilhas Marianas do Norte 	
        mapDestinations.put("MA", "11"); 	// Marrocos
        mapDestinations.put("MH", "37"); 	// Ilhas Marshall 	
        mapDestinations.put("MQ", "131"); 	// Martinica
        mapDestinations.put("UM", "7"); 	// Ilhas Menores 	
        mapDestinations.put("MU", "191"); 	// Maurício
        mapDestinations.put("SB", "32"); 	// Ilhas Salomão 	
        mapDestinations.put("MR", "224"); 	// Mauritânia
        mapDestinations.put("TC", "121"); 	// Ilhas Turks e Caicos 	
        mapDestinations.put("MX", "117"); 	// México
        mapDestinations.put("VG", "148"); 	// Ilhas Virgens (Britânicas) 	
        mapDestinations.put("MM", "22"); 	// Mianmá
        mapDestinations.put("VI", "132"); 	// Ilhas Virgens (U.S.) 	
        mapDestinations.put("FM", "38"); 	// Micronésia
        mapDestinations.put("WF", "51"); 	// TongaIlhas Wallis e Futura 	
        mapDestinations.put("MZ", "226"); 	// Moçambique
        mapDestinations.put("IN", "20"); 	// India 	
        mapDestinations.put("MC", "97"); 	// Mônaco
        mapDestinations.put("ID", "170"); 	// Indonésia 	
        mapDestinations.put("MN", "184"); 	// Mongólia
        mapDestinations.put("MS", "152"); 	// Mont Serrat
        mapDestinations.put("IQ", "16"); 	// Iraque 	
        mapDestinations.put("ME", "99"); 	// Montenegro
        mapDestinations.put("NA", "227"); 	// Namíbia
        mapDestinations.put("NR", "39"); 	// Nauru
        mapDestinations.put("NP", "23"); 	// Nepal
        mapDestinations.put("NI", "128"); 	// Nicarágua
        mapDestinations.put("IR", "8"); 	// Irã 	
        mapDestinations.put("NE", "228"); 	// Níger
        mapDestinations.put("NG", "192"); 	// Nigéria
        mapDestinations.put("IE", "71"); 	// Irlanda 	
        mapDestinations.put("NO", "78"); 	// Noruega
        mapDestinations.put("IS", "89"); 	// Islândia 	
        mapDestinations.put("NC", "40"); 	// Nova Caledônia
        mapDestinations.put("IL", "17"); 	// Israel 	
        mapDestinations.put("NZ", "31"); 	// Nova Zelândia
        mapDestinations.put("IT", "72"); 	// Itália 	
        mapDestinations.put("OM", "106"); 	// Omã
        mapDestinations.put("JM", "116"); 	// Jamaica 	
        mapDestinations.put("JP", "171"); 	// Japão
        mapDestinations.put("PW", "180"); 	// Palau 	
        mapDestinations.put("SE", "85"); 	// Suécia
        mapDestinations.put("PA", "129"); 	// Panamá 	
        mapDestinations.put("CH", "86"); 	// Suíça
        mapDestinations.put("PG", "44"); 	// Papua Nova Guiné 	
        mapDestinations.put("SR", "146"); 	// Suriname
        mapDestinations.put("PK", "24"); 	// Paquistão 	
        mapDestinations.put("SJ", "93"); 	// Svalbard e Jan Mayen
        mapDestinations.put("PY", "118"); 	// Paraguai 	
        mapDestinations.put("TJ", "161"); 	// Tadjiquistão
        mapDestinations.put("PE", "119"); 	// Peru 	
        mapDestinations.put("TH", "178"); 	// Tailândia
        mapDestinations.put("PN", "7"); 	// Pitcairn 	
        mapDestinations.put("TW", "177"); 	// Taiwan
        mapDestinations.put("PF", "30"); 	// Polinésia Francesa 	
        mapDestinations.put("PL", "79"); 	// Polônia 	
        mapDestinations.put("PR", "133"); 	// Porto Rico
        mapDestinations.put("PT", "80"); 	// Portugal 	
        mapDestinations.put("TL", "186"); 	// Timor-Leste
        mapDestinations.put("KE", "188"); 	// Quênia 	
        mapDestinations.put("TG", "235"); 	// Togo
        mapDestinations.put("KG", "106"); 	// Quirguistão 	
        mapDestinations.put("TK", "47"); 	// Tokelau
        mapDestinations.put("GB", "88"); 	// Reino Unido 	
        mapDestinations.put("TO", "48"); 	// Tonga
        mapDestinations.put("TT", "140"); 	// Trinidad e Tobago
        mapDestinations.put("KR", "183"); 	// República da Coréia 	
        mapDestinations.put("TN", "14"); 	// Tunísia
        mapDestinations.put("MK", "91"); 	// República da Macedonia 	
        mapDestinations.put("TM", "162"); 	// Turcomenistão
        mapDestinations.put("MD", "159"); 	// República da Moldova 	
        mapDestinations.put("TR", "87"); 	// Turquia
        mapDestinations.put("CD", "209"); 	// República Dem. Do Congo 	
        mapDestinations.put("DO", "143"); 	// República Dominicana 	
        mapDestinations.put("UA", "163"); 	// Ucrânia
        mapDestinations.put("KP", "176"); 	// República Pop. Dem. da Coreia 	
        mapDestinations.put("UG", "236"); 	// Uganda
        mapDestinations.put("CZ", "63"); 	// República Tcheca 	
        mapDestinations.put("UY", "122"); 	// Uruguai
        mapDestinations.put("TZ", "195"); 	// República Unida da Tanzânia 	
        mapDestinations.put("UZ", "164"); 	// Uzbequistão
        mapDestinations.put("VU", "50"); 	// Vanuatu
        mapDestinations.put("RO", "81"); 	// Romênia 	
        mapDestinations.put("VA", "94"); 	// Vaticano
        mapDestinations.put("RW", "229"); 	// Ruanda 	
        mapDestinations.put("VE", "123"); 	// Venezuela
        mapDestinations.put("EH", "237"); 	// Saara Ocidental 	
        mapDestinations.put("VN", "179"); 	// Vietnã
        mapDestinations.put("PM", "104"); 	// Saint Pierre e Miquelon 	
        mapDestinations.put("YU", "2"); 	// Yugoslávia
        mapDestinations.put("AS", "34"); 	// Samoa Americana 	
        mapDestinations.put("ZR", "106"); 	// Zaire
        mapDestinations.put("WS", "7"); 	// Samoa Ocidental 	
        mapDestinations.put("ZM", "196"); 	// Zâmbia
        mapDestinations.put("SH", "239"); 	// Santa Helena 	
        mapDestinations.put("ZW", "197"); 	// Zimbábue
        mapDestinations.put("LC", "120"); 	// Santa Lúcia 	
        mapDestinations.put("KN", "106"); 	// São Cristovão e Nevis
        mapDestinations.put("SM", "95"); 	// São Marino 	
        mapDestinations.put("ST", "230"); 	// São Tomé e Príncipe
        mapDestinations.put("VC", "147"); 	// São Vicente e Granadinas 	
        mapDestinations.put("SN", "231"); 	// Senegal
        mapDestinations.put("SL", "232"); 	// Serra Leoa 	
        mapDestinations.put("RS", "98"); 	// Sérvia
        mapDestinations.put("SC", "193"); 	// Seychelles 	
        mapDestinations.put("SG", "175"); 	// Singapura
        mapDestinations.put("SY", "13"); 	// Síria 	
        mapDestinations.put("SO", "233"); 	// Somália
        mapDestinations.put("LK", "25"); 	// Sri Lanka 	
        mapDestinations.put("SZ", "234"); 	// Suazilândia
        mapDestinations.put("SD", "12"); 	// Sudão
        
        return mapDestinations;
        
    }
    
        public static String getSgCurrency(WSIntegrador integrador, String codigo) throws ErrorException {
        String sgMoeda = null;
        if(codigo != null && !codigo.isEmpty()){
            switch(codigo){
                case "413":
                    sgMoeda = "EUR";
                    break;
                case "520":
                    sgMoeda = "USD";
                    break;
                case "49308":
                    sgMoeda = "BRL";
                    break;
                default:
                    throw new ErrorException(integrador, SupplierBase.class, "getSgCurrency", WSMensagemErroEnum.GENMETHOD, 
                        "Não foi mapeado a sigla da moeda - Entre em contato com o suporte", WSIntegracaoStatusEnum.NEGADO, null, false);
            }
        } else {
            throw new ErrorException(integrador, SupplierBase.class, "obterCodCurrency", WSMensagemErroEnum.GENMETHOD, 
                    "Não foi definido a sigla para moeda ao conector (SgMoeda - Integrador) - Verifique os parâmetros cadastrados", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
        }
        
        return sgMoeda;
    }
    
    public static String getCodCurrency(WSIntegrador integrador) throws ErrorException {
        String codigo = null;
        if(integrador.getSgMoeda() != null && !integrador.getSgMoeda().isEmpty()){
            switch(integrador.getSgMoeda()){
                case "EUR":
                    codigo = "413";
                    break;
                case "USD":
                    codigo = "520";
                    break;
                case "BRL":
                    codigo = "49308";
                    break;
                default:
                    throw new ErrorException(integrador, SupplierBase.class, "getCodCurrency", WSMensagemErroEnum.GENMETHOD, 
                        "Não foi mapeado o código da moeda - Entre em contato com o suporte", WSIntegracaoStatusEnum.NEGADO, null, false);
            }
        } else {
            codigo = "49308";
//            throw new ErrorException(integrador, SupplierBase.class, "obterCodCurrency", WSMensagemErroEnum.GENMETHOD, 
//                    "Não foi definido a sigla para moeda ao conector (SgMoeda - Integrador) - Verifique os parâmetros cadastrados", WSIntegracaoStatusEnum.INCONSISTENTE, null, false);
        }
        
        return codigo;
    }
    
    public static WSSexoEnum getSexoEnum(WSIntegrador integrador, String codSalutation) throws ErrorException {
        WSSexoEnum sexo = null;
        try {
            switch(codSalutation){
                case "147":
                case "558":
                case "1328":
                case "74185":
                    sexo = WSSexoEnum.MASCULINO;
                    break;
                case "148":
                case "149":
                case "3801":
                case "1671":
                case "9234":
                case "14632":
                case "15134":
                case "74195":
                    sexo = WSSexoEnum.FEMININO;
                    break;
                default:
                    sexo = WSSexoEnum.NAO_INFORMADO;
            } 
        } catch (Exception ex) {
            throw new ErrorException(integrador, SupplierBase.class, "getSexoEnum", WSMensagemErroEnum.GENMETHOD,
                "Erro ao obter o localizador da reserva - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return sexo;
    }
    
    public static WSPaxTipoEnum getTypePax(WSIntegrador integrador, String codTypePax) throws ErrorException {
        WSPaxTipoEnum typePax = null;
        try {
            switch(codTypePax){
                case "147":
                case "558":
                case "1328":
                case "74185":
                case "148":
                case "149":
                case "3801":
                case "1671":
                case "9234":
                case "15134":
                case "74195":
                    typePax = WSPaxTipoEnum.ADT;
                    break;
                case "14632":
                    typePax = WSPaxTipoEnum.CHD;
                    break;
                default:
                    typePax = WSPaxTipoEnum.ADT;
            } 
        } catch (Exception ex) {
            throw new ErrorException(integrador, SupplierBase.class, "getSexoEnum", WSMensagemErroEnum.GENMETHOD,
                "Erro ao obter o localizador da reserva - Entre em contato com o suporte", WSIntegracaoStatusEnum.INCONSISTENTE, ex, false);
        }
        
        return typePax;
    }
}
