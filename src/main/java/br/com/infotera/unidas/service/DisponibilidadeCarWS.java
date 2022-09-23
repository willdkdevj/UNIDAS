/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotera.unidas.service;

import br.com.infotera.common.*;
import br.com.infotera.common.enumerator.*;
import br.com.infotera.common.media.WSMedia;
import br.com.infotera.common.servico.*;
import br.com.infotera.common.servico.rqrs.WSDisponibilidadeVeiculoRQ;
import br.com.infotera.common.servico.rqrs.WSDisponibilidadeVeiculoRS;
import br.com.infotera.common.util.Utils;
import br.com.infotera.unidas.client.UnidasClient;
import br.com.infotera.unidas.model.gen.ArrayOfSourceType;
import br.com.infotera.unidas.model.gen.CompanyNameType;
import br.com.infotera.unidas.model.gen.InventoryStatusType;
import br.com.infotera.unidas.model.gen.OTAVehAvailRateRQ;
import br.com.infotera.unidas.model.gen.OtaVehAvailRate;
import br.com.infotera.unidas.model.gen.OtaVehAvailRateResponse;
import br.com.infotera.unidas.model.gen.SourceType;
import br.com.infotera.unidas.model.gen.VehicleAvailRQAdditionalInfoType;
import br.com.infotera.unidas.model.gen.VehicleAvailRQCoreType;
import br.com.infotera.unidas.model.gen.VehicleRentalCoreType;
import br.com.infotera.unidas.service.interfaces.OTAVehAvailRequest;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.springframework.stereotype.Component;

@Component
public class DisponibilidadeCarWS {

    @Autowired
    private UnidasClient unidasClient;
    @Autowired
    private OTAVehAvailRequest request;

    public WSDisponibilidadeVeiculoRS disponibilidade(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ) throws ErrorException {

        OtaVehAvailRate carAvailability = request.builderOTAVehAvailRateRequest(disponibilidadeVeiculoRQ);

        OtaVehAvailRateResponse  otaVehAvailRateResponse = unidasClient.invokeA(disponibilidadeVeiculoRQ.getIntegrador(), carAvailability);
//        List<ParCarAvailabilityReply> parCarAvailabilityReplyList = disponibilidadeThread(disponibilidadeVeiculoRQ.getIntegrador(), carAvailability);
//
//        List<WSVeiculoPesquisa> veiculoPesquisaList = new ArrayList();
//        for (ParCarAvailabilityReply pcar : parCarAvailabilityReplyList) {
//              if (pcar.getCarAvailabilityReply().getAvailabilityDetails()!=null){
//                 veiculoPesquisaList.addAll(chamaPesquisaThread(disponibilidadeVeiculoRQ.getIntegrador(), pcar));
//              }
//        }
//        
        return null;
    }
//
//        //agrupa os veiculos por categoria
//        Map<String, List<WSVeiculo>> veiculoListMap = new LinkedHashMap();
//        for (WSVeiculoPesquisa vp : veiculoPesquisaList) {
//
//            List<WSVeiculo> veiculoListTemp = veiculoListMap.get(vp.getVeiculoList().get(0).getNmClasse());
//            if (veiculoListTemp == null) {
//                veiculoListTemp = new ArrayList();
//            }
//            WSVeiculo veiculo = vp.getVeiculoList().get(0);
//
//            veiculoListTemp.add(veiculo);
//
//            veiculoListMap.put(vp.getVeiculoList().get(0).getNmClasse(), veiculoListTemp);
//        }
//        veiculoPesquisaList = new ArrayList();
//        Integer sqPesquisa = 0;
//
//        //agrupa as tarifas por tipo de veiculo
//        for (Map.Entry<String, List<WSVeiculo>> map : veiculoListMap.entrySet()) {
//
//            Map<String, List<WSVeiculo>> veiculoTipoMap = new LinkedHashMap();
//            map.getValue().forEach((v) -> {
//                List<WSVeiculo> veiculoListTemp = veiculoTipoMap.get(v.getCdServico() + v.getLocadora().getCdLocadora() + v.getLocalRetirada().getCdLocal());
//                if (veiculoListTemp == null) {
//                    veiculoListTemp = new ArrayList();
//                }
//                veiculoListTemp.add(v);
//                veiculoTipoMap.put(v.getCdServico() + v.getLocadora().getCdLocadora() + v.getLocalRetirada().getCdLocal(), veiculoListTemp);
//            });
//
//            List<WSVeiculo> veiculoFinalList = new ArrayList();
//            veiculoTipoMap.entrySet().stream().map((mapTipo) -> {
//                WSVeiculo veiculo = null;
//                for (WSVeiculo v : mapTipo.getValue()) {
//                    if (v != null) {
//                        if (veiculo != null) {
//                            if (veiculo.getTarifaOpcionalList() == null) {
//                                List<WSTarifa> tarifaOpcionalList = new ArrayList();
//                                tarifaOpcionalList.add(v.getTarifa());
//                                veiculo.setTarifaOpcionalList(tarifaOpcionalList);
//                            } else {
//                                List<WSTarifa> tarifaOpcionalList = veiculo.getTarifaOpcionalList();
//
//                                Map<String, WSTarifa> mapTarifa = new LinkedHashMap();
//                                tarifaOpcionalList.forEach(t -> {
//                                    WSTarifa tMap = mapTarifa.get(t.getDsTarifa());
//                                    if (tMap == null) {
//                                        mapTarifa.put(t.getDsTarifa(), t);
//                                    } else {
//                                        if (tMap.getVlNeto() > t.getVlNeto()) {
//                                            mapTarifa.put(t.getDsTarifa(), t);
//                                        }
//                                    }
//                                });
//
//                                if (mapTarifa.get(v.getTarifa().getDsTarifa()) == null) {
//                                    tarifaOpcionalList.add(v.getTarifa());
//                                    veiculo.setTarifaOpcionalList(tarifaOpcionalList);
//                                }
//                            }
//                        } else {
//                            veiculo = v;
//                            if (veiculo.getTarifaOpcionalList() == null) {
//                                List<WSTarifa> tarifaOpcionalList = new ArrayList();
//                                tarifaOpcionalList.add(v.getTarifa());
//                                veiculo.setTarifaOpcionalList(tarifaOpcionalList);
//                            } else {
//                                List<WSTarifa> tarifaOpcionalList = veiculo.getTarifaOpcionalList();
//
//                                Map<String, WSTarifa> mapTarifa = new LinkedHashMap();
//                                tarifaOpcionalList.forEach(t -> {
//                                    WSTarifa tMap = mapTarifa.get(t.getDsTarifa());
//                                    if (tMap == null) {
//                                        mapTarifa.put(t.getDsTarifa(), t);
//                                    } else {
//                                        if (tMap.getVlNeto() > t.getVlNeto()) {
//                                            mapTarifa.put(t.getDsTarifa(), t);
//                                        }
//                                    }
//                                });
//
//                                if (mapTarifa.get(v.getTarifa().getDsTarifa()) == null) {
//                                    tarifaOpcionalList.add(v.getTarifa());
//                                    veiculo.setTarifaOpcionalList(tarifaOpcionalList);
//                                }
//                            }
//                        }
//                    }
//                }
//                return veiculo;
//            }).filter((veiculo) -> (veiculo != null)).forEachOrdered((veiculo) -> {
//                veiculoFinalList.add(veiculo);
//            });
//            sqPesquisa++;
//            veiculoPesquisaList.add(new WSVeiculoPesquisa(sqPesquisa, veiculoFinalList, map.getKey()));
//        }
//
//        return new WSDisponibilidadeVeiculoRS(veiculoPesquisaList, disponibilidadeVeiculoRQ.getIntegrador(), WSIntegracaoStatusEnum.OK);
//    }
//
//    private List<ParCarAvailabilityReply> disponibilidadeThread(WSIntegrador integrador, List<ParCarAvailability> parCarAvailabilityList) throws ErrorException {
//
//        Long tempoInicio = System.currentTimeMillis();
//        List<ParCarAvailabilityReply> parCarAvailabilityReplyList = new ArrayList();
//        ExecutorService threadPool = Executors.newFixedThreadPool(parCarAvailabilityList.size());
//        try {
//            Collection<Future<?>> futures = new LinkedList();
//            int sqThread = 1;
//            for (ParCarAvailability pca : parCarAvailabilityList) {
//                sqThread++;
//                ThreadCarAvailability threadCarAvailability = new ThreadCarAvailability(integrador, pca, amadeusClient);
//                futures.add(threadPool.submit(threadCarAvailability));
//            }
//            for (Future<?> future : futures) {
//                try {
//                    ParCarAvailabilityReply parCarAvailabilityReply = (ParCarAvailabilityReply) future.get();
//                    parCarAvailabilityReplyList.add(parCarAvailabilityReply);
//                } catch (InterruptedException e) {
//                    // throw new RuntimeException(e);
//                } catch (ExecutionException e) {
//                    //throw new RuntimeException(e);
//                }
//            }
//        } catch (RuntimeException e) {
//            //throw e;
//        } finally {
//            threadPool.shutdown();
//        }
//        return parCarAvailabilityReplyList;
//    }
//
//    //sobreescrevendo RQ por causa da thread
//    public WSDisponibilidadeVeiculoRQ montaWSDisponibilidadeVeiculoRQ(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ, List<WSCiaTourCode> ciaTourCodeList) {
//
//        WSIntegrador integradorNovo = new WSIntegrador();
//        WSIntegrador integrador = disponibilidadeVeiculoRQ.getIntegrador();
//        integradorNovo.setIntegradorEnum(integrador.getIntegradorEnum());
//        integradorNovo.setId(integrador.getId());
//        integradorNovo.setNmIntegrador(integrador.getNmIntegrador());
//        integradorNovo.setAmbiente(integrador.getAmbiente());
//        integradorNovo.setDsMensagem(integrador.getDsMensagem());
//        integradorNovo.setDsErro(integrador.getDsErro());
//        integradorNovo.setUsuario(integrador.getUsuario());
//        integradorNovo.setSenha(integrador.getSenha());
//        integradorNovo.setEstabelecimento(integrador.getEstabelecimento());
//        integradorNovo.setIdParceiro(integrador.getIdParceiro());
//        integradorNovo.setHistoricoList(integrador.getHistoricoList());
//        integradorNovo.setSgMunicipio(integrador.getSgMunicipio());
//        integradorNovo.setDsUrl(integrador.getDsUrl());
//        integradorNovo.setSgMoeda(integrador.getSgMoeda());
//        integradorNovo.setStLocal(integrador.isStLocal());
//        integradorNovo.setDsParametro(integrador.getDsParametro());
//        integradorNovo.setDsCredencialList(integrador.getDsCredencialList());
//        integradorNovo.setCiaTourCodeList(integrador.getCiaTourCodeList());
//        integradorNovo.setIntegracaoStatus(integrador.getIntegracaoStatus());
//        integradorNovo.setStSelecionado(integrador.isStSelecionado());
//        integradorNovo.setDsUrlRetornoOK(integrador.getDsUrlRetornoOK());
//        integradorNovo.setDsUrlRetornoCancel(integrador.getDsUrlRetornoCancel());
//        integradorNovo.setIdFornecedor(integrador.getIdFornecedor());
//        integradorNovo.setIdEmpresa(integrador.getIdEmpresa());
//        integradorNovo.setCdIntegra(integrador.getCdIntegra());
//        integradorNovo.setSgEmpresa(integrador.getSgEmpresa());
//        integradorNovo.setNmUsuarioEmpresa(integrador.getNmUsuarioEmpresa());
//        integradorNovo.setSessao(integrador.getSessao());
//        integradorNovo.setSessaoList(integrador.getSessaoList());
//        integradorNovo.setIntegradorLogList(integrador.getIntegradorLogList());
//        integradorNovo.setCdLocalizador(integrador.getCdLocalizador());
//        integradorNovo.setStErro(integrador.isStErro());
//
//        integradorNovo.setCiaTourCodeList(ciaTourCodeList);
//
//        WSDisponibilidadeVeiculoRQ retorno = new WSDisponibilidadeVeiculoRQ(integradorNovo,
//                disponibilidadeVeiculoRQ.getAutenticacao(),
//                disponibilidadeVeiculoRQ.getDtRetirada(),
//                disponibilidadeVeiculoRQ.getCdLocalRetirada(),
//                disponibilidadeVeiculoRQ.getDtDevolucao(),
//                disponibilidadeVeiculoRQ.getCdLocalDevolucao());
//
//        retorno.setCdLatitudeRetirada(disponibilidadeVeiculoRQ.getCdLatitudeRetirada());
//        retorno.setCdLatitudeDevolucao(disponibilidadeVeiculoRQ.getCdLatitudeDevolucao());
//        retorno.setCdLongitudeRetirada(disponibilidadeVeiculoRQ.getCdLongitudeRetirada());
//        retorno.setCdLongitudeDevolucao(disponibilidadeVeiculoRQ.getCdLongitudeDevolucao());
//        retorno.setQtRaio(disponibilidadeVeiculoRQ.getQtRaio());
//
//        return retorno;
//    }
//
//    public List<ParCarAvailability> montaPesquisa(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ) throws ErrorException {
//
//        List<ParCarAvailability> parCarAvailabilityList = new ArrayList();
//        boolean chamaPesquisa;
//
//        Double qtDias = Utils.dividir(0, Double.parseDouble(Utils.diferencaEmHora(disponibilidadeVeiculoRQ.getDtRetirada(), disponibilidadeVeiculoRQ.getDtDevolucao()).replace(":", ".")), 24.0);
//        Double qtResto = Double.parseDouble(Utils.diferencaEmHora(disponibilidadeVeiculoRQ.getDtRetirada(), disponibilidadeVeiculoRQ.getDtDevolucao()).replace(":", ".")) % 24.0;
//        if (qtResto > 0.0) {
//            qtDias = qtDias + 1;
//        }
//        Integer qtDia = qtDias.intValue();
//
//        List<ParCredencial> parCredencialList = UtilsWSCar.montaParCredencial(disponibilidadeVeiculoRQ.getIntegrador(), null, disponibilidadeVeiculoRQ.getDtRetirada());
//
//        Map<String, List<ParCredencial>> mapCredencialPorLocadora = new HashMap();
//
//        for (ParCredencial pc : parCredencialList) {
//
//            String iata = null;
//            if (pc.getBsIata() != null && pc.getBsIata().trim() != null) {
//                iata = pc.getBsIata();
//            } else {
//                iata = "NAOINF";
//            }
//            List<ParCredencial> parCredencialExistList = mapCredencialPorLocadora.get(iata + "#" + pc.getSgLocadora());
//
//            if (parCredencialExistList == null) {
//                parCredencialExistList = new ArrayList();
//            }
//            parCredencialExistList.add(pc);
//            mapCredencialPorLocadora.put(iata + "#" + pc.getSgLocadora(), parCredencialExistList);
//
//        }
//
//        for (Map.Entry<String, List<ParCredencial>> map : mapCredencialPorLocadora.entrySet()) {
//
//            List<ParCredencial> parCredencialLocadoraList = map.getValue();
//
//            parCredencialLocadoraList.removeIf(p -> !UtilsWSCar.isBetween(qtDia, p.getQtDiaIni(), p.getQtDiaFim()));
//
//            CarAvailability availability = new CarAvailability();
//
//            if (parCredencialLocadoraList.size() > 0) {
//
//                String locadoraIataSplit[] = map.getKey().split("#");
//
//                String cdIata = locadoraIataSplit[0];
//                String cdLocadora = locadoraIataSplit[1];
//
//                if (!cdIata.equals("NAOINF")) {
//                    AdditionalBusinessSourceInformationType additionalBusinessSourceInformationType = new AdditionalBusinessSourceInformationType();
//                    com.amadeus.xml.rcarrq_17_1_1a.OriginatorIdentificationDetailsTypeI originatorIdentificationDetailsTypeI = new com.amadeus.xml.rcarrq_17_1_1a.OriginatorIdentificationDetailsTypeI();
//                    originatorIdentificationDetailsTypeI.setOriginatorId(cdIata);
//                    additionalBusinessSourceInformationType.setOriginatorDetails(originatorIdentificationDetailsTypeI);
//                    availability.setBookingSource(additionalBusinessSourceInformationType);
//                }
//
//                //monta os tourcodes
//                // if (disponibilidadeVeiculoRQ.getIntegrador().getCiaTourCodeList() != null) {
//                // List<CarAvailability.ProviderSpecificOptions1> ProviderSpecificOptionsList = montaProviderSpecificOptions_old(disponibilidadeVeiculoRQ.getIntegrador().getCiaTourCodeList(), disponibilidadeVeiculoRQ.getIntegrador(), qtDia);
//                List<CarAvailability.ProviderSpecificOptions1> ProviderSpecificOptionsList = montaProviderSpecificOptions(parCredencialLocadoraList, disponibilidadeVeiculoRQ.getIntegrador(), qtDia);
//                if (!Utils.isListNothing(ProviderSpecificOptionsList)) {
//                    availability.getProviderSpecificOptions().addAll(ProviderSpecificOptionsList);
//                    chamaPesquisa = true;
//                } else {
//                    chamaPesquisa = false;
//                }
//                //  }
//                if (chamaPesquisa) {
//                    CarAvailability.PickupDropoffInfo pickupDropoffInfo = montaPickupDropoffInfo(disponibilidadeVeiculoRQ);
//                    if (pickupDropoffInfo != null) {
//                        availability.getPickupDropoffInfo().add(pickupDropoffInfo);
//                        chamaPesquisa = true;
//                    } else {
//                        chamaPesquisa = false;
//                    }
//                }
//
//                if (chamaPesquisa) {
//                    availability.setCarProviderIndicator(montaStatusType79177S("Y"));
//                    availability.setMultimediaIndicator(montaStatusType79177S("MY"));
//
//                    CarAvailability.MultiMediaContent mediaContent = new CarAvailability.MultiMediaContent();
//                    ActionIdentificationTypeI actionIdentificationTypeI1 = new ActionIdentificationTypeI();
//                    actionIdentificationTypeI1.setActionRequestCode("CPY");
//                    SelectionDetailsTypeI79188S detailsTypeI79188S = new SelectionDetailsTypeI79188S();
//                    SelectionDetailsInformationTypeI detailsInformationTypeI = new SelectionDetailsInformationTypeI();
//
//                    mediaContent.setPicturesType(actionIdentificationTypeI1);
//                    detailsInformationTypeI.setOption("1");
//                    detailsTypeI79188S.setSelectionDetails(detailsInformationTypeI);
//                    mediaContent.getPictureSize().add(detailsTypeI79188S);
//                    availability.getMultiMediaContent().add(mediaContent);
//
//                    mediaContent = new CarAvailability.MultiMediaContent();
//                    actionIdentificationTypeI1 = new ActionIdentificationTypeI();
//                    actionIdentificationTypeI1.setActionRequestCode("VEH");
//                    detailsTypeI79188S = new SelectionDetailsTypeI79188S();
//                    detailsInformationTypeI = new SelectionDetailsInformationTypeI();
//                    mediaContent.setPicturesType(actionIdentificationTypeI1);
//                    detailsInformationTypeI.setOption("6");
//                    detailsTypeI79188S.setSelectionDetails(detailsInformationTypeI);
//                    mediaContent.getPictureSize().add(detailsTypeI79188S);
//                    availability.getMultiMediaContent().add(mediaContent);
//
//                    //RateClass
//                    AttributeType attributeType = new AttributeType();
//
//                    attributeType.setCriteriaSetType("ALL");
//                    availability.setRateClass(attributeType);
//
//                    TariffInformationTypeI informationTypeI = new TariffInformationTypeI();
//                    TariffInformationDetailsTypeI detailsTypeI = new TariffInformationDetailsTypeI();
//
//                    detailsTypeI.setCurrency(disponibilidadeVeiculoRQ.getIntegrador().getSgMoeda());
//                    informationTypeI.setTariffInfo(detailsTypeI);
//                    availability.setRateinfo(informationTypeI);
//
//                    //ComputeMarkups
//                    ActionIdentificationTypeI actionIdentificationTypeI = new ActionIdentificationTypeI();
//
//                    actionIdentificationTypeI.setActionRequestCode("N");
//                    availability.setComputeMarkups(actionIdentificationTypeI);
//
//                    //SortingRule
//                    ActionIdentificationType actionIdentificationType = new ActionIdentificationType();
//                    actionIdentificationType.setActionRequestCode("CTG");//STD
//                    availability.setSortingRule(actionIdentificationType);
//
//                    StatusType statusType = new StatusType();
//                    StatusDetailsTypeI150620C sdtic = new StatusDetailsTypeI150620C();
//
//                    sdtic.setIndicator("BYP");
//                    sdtic.setType("LNB");
//                    statusType.setStatusInformation(sdtic);
//                    availability.setClientProfileOptions(statusType);
//
//                    parCarAvailabilityList.add(new ParCarAvailability(availability, parCredencialLocadoraList));
//                }
//            }
//        }
//
//        return parCarAvailabilityList;
//
//    }
//
//    //metodo faz a chamada e monta o retorno
//    public List<WSVeiculoPesquisa> chamaPesquisaThread(WSIntegrador integrador, ParCarAvailabilityReply parCarAvailabilityReply) throws ErrorException {
//
//        List<WSVeiculoPesquisa> veiculoPesquisaList = new ArrayList();
//        String dsMensagem = null;
//        Set<String> naoMostraTarifaMap = new HashSet();
//        if (parCarAvailabilityReply.getCarAvailabilityReply() != null) {
//
//            try {
//                //locadora retirada e devolucao
//                Map<String, WSVeiculoLocal> localRetiradaMap = new LinkedHashMap();
//                Map<String, WSVeiculoLocal> localDevolucaoMap = new LinkedHashMap();
//                WSVeiculoLocal localRetirada = null;
//                WSVeiculoLocal localDevolucao = null;
//
//                String cdLocadoraRetirada = null;
//                String cdLocadoraDevolucao = null;
//                Boolean isDevMesmoLocal = null;
//
//               
//                try {
//                  
//                    for (CarAvailabilityReply.AvailabilityDetails.CompanyLocationInfo cit : parCarAvailabilityReply.getCarAvailabilityReply().getAvailabilityDetails().getCompanyLocationInfo()) {
//                        boolean umaVez = true;
//                        if (cit.getRentalLocation().size() == 1) {
//                            isDevMesmoLocal = true;
//                            for (CarAvailabilityReply.AvailabilityDetails.CompanyLocationInfo.RentalLocation rl : cit.getRentalLocation()) {
//                                cdLocadoraRetirada = rl.getAddress().getLocationDetails().getName();
//                                cdLocadoraDevolucao = rl.getAddress().getLocationDetails().getName();
//                            }
//
//                            localRetirada = montaVeiculoLocal(cit.getRentalLocation().get(0), cit.getCarCompanyData().getCompanyCode(), cit.getCarCompanyData().getCompanyName());
//                            localDevolucao = localRetirada;
//                        } else {
//                            isDevMesmoLocal = false;
//                            for (CarAvailabilityReply.AvailabilityDetails.CompanyLocationInfo.RentalLocation rl : cit.getRentalLocation()) {
//                                if (umaVez) {
//                                    localRetirada = montaVeiculoLocal(rl, cit.getCarCompanyData().getCompanyCode(), cit.getCarCompanyData().getCompanyName());
//                                    cdLocadoraRetirada = rl.getAddress().getLocationDetails().getName();
//                                    umaVez = false;
//                                } else {
//                                    localDevolucao = montaVeiculoLocal(rl, cit.getCarCompanyData().getCompanyCode(), cit.getCarCompanyData().getCompanyName());
//                                    cdLocadoraDevolucao = rl.getAddress().getLocationDetails().getName();
//                                }
//                            }
//                        }
//
//                        localRetiradaMap.put(cit.getCarCompanyData().getCompanyCode() + cdLocadoraRetirada, localRetirada);
//                        localDevolucaoMap.put(cit.getCarCompanyData().getCompanyCode() + cdLocadoraDevolucao, localDevolucao);
//                    }
//                } catch (Exception ex) {
//                    throw new ErrorException(integrador, DisponibilidadeCarWS.class, "Disponibilidade", WSMensagemErroEnum.SDI, "Erro ao ler CompanyLocationInfo", WSIntegracaoStatusEnum.NEGADO, ex, false);
//                }
//
//                for (CarAvailabilityReply.AvailabilityDetails.Rates rates : parCarAvailabilityReply.getCarAvailabilityReply().getAvailabilityDetails().getRates()) {
//
//                    String cdLocadora = rates.getCarCompanyData().getCompanyCode();
//                    //VALIDAR OS TOURCODES DE RETORNOS 
//                    Map<String, String> discountNumberMap = new HashMap();
//                    String dsTourCodeRetornado = cdLocadora;
//
//                    List<String> tourCodeRetornadoList = new ArrayList();
//
//                    //busca tourcodes retornados
//                    for (CarAvailabilityReply.AvailabilityDetails.Rates.LoyaltyNumbersList.DiscountNumbers.CustomerReferenceInfo cri : rates.getLoyaltyNumbersList().getDiscountNumbers().getCustomerReferenceInfo()) {
//                        discountNumberMap.put(cri.getReferenceQualifier() + cri.getReferenceNumber(), cri.getReferenceQualifier() + cri.getReferenceNumber());
//                        tourCodeRetornadoList.add(cri.getReferenceQualifier() + cri.getReferenceNumber());
//
//                    }
//                    //ordena a lista de tourcode retornados
//                    Collections.sort(tourCodeRetornadoList);
//
//                    //gera chave dos tourcodes
//                    for (String s : tourCodeRetornadoList) {
//                        dsTourCodeRetornado += "/" + s;
//                    }
//
//                    String dsTourCodeRetornoValidar = dsTourCodeRetornado;
//
//                    //verifica se tem algum tourcode na credencial como variavel (utilizando "*"
//                    //caso tenha ajusta a chave de retorno para comparacao
//
//                    
//                    for (ParCredencial pc : parCarAvailabilityReply.getParCredencialList()){
//                        if (pc.isCdVariavel() && pc.getSgLocadora().equals(cdLocadora)){
//                            
//                                 for (String z : pc.getTourCodeChave()) {
//                                    List<String> tourCredList = Arrays.asList(z.split("/"));
//                                    boolean isModificado = false;
//                                    for (String c : tourCredList) {
//                                    if (c.contains("*")) {
//                                        List<String> tourRetList = Arrays.asList(dsTourCodeRetornado.split("/"));
//
//                                        String dsTourCodeRetornadoModificado = null;
//                                        for (String x : tourRetList) {
//                                            if (x.substring(0, 2).equals(c.substring(0, 2))) {
//                                                if (c.equals("*")) {
//                                                    dsTourCodeRetornadoModificado = (dsTourCodeRetornadoModificado == null ? x.replace(x, c) : dsTourCodeRetornadoModificado + "/" + x.replace(x, c));
//                                                } else {
//                                                //codigo parcial
//                                                    if (c.substring(0, c.indexOf("*")).equals(x.substring(0, c.indexOf("*")))) {
//                                                    dsTourCodeRetornadoModificado = (dsTourCodeRetornadoModificado == null ? x.replace(x, c) : dsTourCodeRetornadoModificado + "/" + x.replace(x, c));
//                                                    } else {
//                                                    break;
//                                                    }
//                                                }
//                                                isModificado = true;
//                                            } else {
//                                                dsTourCodeRetornadoModificado = (dsTourCodeRetornadoModificado == null ? x : dsTourCodeRetornadoModificado + "/" + x);
//                                            }
//                                        }
//                                        if (isModificado) {
//                                            dsTourCodeRetornoValidar = dsTourCodeRetornadoModificado;
//                                            break;
//                                        }
//                                    }
//                                }
//                                if (isModificado) {
//                                 break;
//                                }
//                        }
//                      }
//                    }
//
//                    //validar se existe o tourde da tarifa para mostrar
//                    final String tourCodeVerifica = dsTourCodeRetornoValidar;
//                    ParCredencial parCredencialExiste = parCarAvailabilityReply.getParCredencialList().stream()
//                            .filter(p -> p.getTourCodeChave().contains(tourCodeVerifica) && p.getSgLocadora().equals(cdLocadora))
//                            .findAny()
//                            .orElse(null);
//
//                    if (parCredencialExiste == null) {
//                        naoMostraTarifaMap.add(dsTourCodeRetornado);
//                    } else {
//                        CarAvailabilityReply.AvailabilityDetails.Rates.PickupDropoffTime.BeginDateTime bdt = rates.getPickupDropoffTime().getBeginDateTime();
//                        CarAvailabilityReply.AvailabilityDetails.Rates.PickupDropoffTime.EndDateTime edt = rates.getPickupDropoffTime().getEndDateTime();
//                        Date dtRetirada = Utils.toDate(bdt.getYear().toString() + "-" + bdt.getMonth().toString() + "-" + bdt.getDay().toString() + "T" + bdt.getHour().toString() + ":" + bdt.getMinutes(), "yyyy-MM-dd'T'HH:mm");
//                        Date dtDevolucao = Utils.toDate(edt.getYear().toString() + "-" + edt.getMonth().toString() + "-" + edt.getDay().toString() + "T" + edt.getHour().toString() + ":" + edt.getMinutes(), "yyyy-MM-dd'T'HH:mm");
//                        List<WSVeiculo> veiculoList = new ArrayList();
//
//                        WSVeiculoLocadora locadora = new WSVeiculoLocadora(cdLocadora, rates.getCarCompanyData().getCompanyName(), null, null, false);
//
//                        //Tarifas
//                        String sgMoeda = integrador.getSgMoeda();
//
//                        List<ParRate> parRateList = new ArrayList();
//                        try {
//                            for (CarAvailabilityReply.AvailabilityDetails.Rates.RateDetailsInfo.TariffInfo ti : rates.getRateDetailsInfo().getTariffInfo()) {
//                                if (ti.getRateType() != null && ti.getRateCurrency() != null && ti.getRateAmount() != null) {
//                                    parRateList.add(new ParRate(ti.getRateType(), ti.getRateCurrency(), null, ti.getRateAmount(), null));
//                                }
//                            }
//                        } catch (Exception ex) {
//                            throw new ErrorException(integrador, DisponibilidadeCarWS.class, "Disponibilidade", WSMensagemErroEnum.SDI, "Erro ao ler AssociatedCharges", WSIntegracaoStatusEnum.NEGADO, ex);
//                        }
//
//                        boolean isNacional = false;
//                        if (localRetirada != null) {
//                            if (localRetirada.getNmPais().equals("BR") || localRetirada.getNmPais().toUpperCase().equals("BRASIL")) {
//                                isNacional = true;
//                            }
//                        } else if (sgMoeda.equals("BRL")) {
//                            isNacional = true;
//                        }
//
//                        ParTarifa parTarifa = UtilsWSCar.calcularTarifa(integrador,
//                                cdLocadora,
//                                parRateList,
//                                null,
//                                null,
//                                sgMoeda,
//                                isDevMesmoLocal,
//                                isNacional,
//                                dtRetirada,
//                                dtDevolucao,
//                                parCredencialExiste.getTpTaxaLocal(),
//                                parCredencialExiste.getTpTaxaAdm(),
//                                true);
//
//                        //busca o IT retornado
//                        String cdIT = null;
//
//                        for (CustomerReferenceInfo cri : rates.getLoyaltyNumbersList().getDiscountNumbers().getCustomerReferenceInfo()) {
//                            if (cri.getReferenceQualifier().equals("IT")) {
//                                cdIT = cri.getReferenceNumber();
//                            }
//                        }
//                        if (cdIT == null) {
//                            cdIT = parCredencialExiste.getCdReservaIT();
//                        }
//
//                        ParDisponibilidade disponibilidade = new ParDisponibilidade(rates.getCarCompanyData().getTravelSector(),
//                                rates.getCarCompanyData().getAccessLevel(),
//                                rates.getRateDetailsInfo().getExtraRateTypeInfo().getRateCategory(),
//                                rates.getRateDetailsInfo().getTariffInfo().get(0).getRateIdentifier(),
//                                rates.getVehicleTypeInfo().getVehicleCharacteristic().getVehicleTypeOwner(),
//                                dsTourCodeRetornado,
//                                parCredencialExiste.getCdReservaSI(),
//                                cdIT,
//                                rates.getRateDetailsInfo().getTariffInfo().get(0).getRateType(),
//                                parCredencialExiste.getTpTaxaLocal(),
//                                parCredencialExiste.getTpTaxaAdm(),
//                                parCredencialExiste.getBsIata());
//
//                        String dsParametro = UtilsWSCar.toJson(disponibilidade);
//
//                        WSTarifa tarifa = new WSTarifa(sgMoeda,
//                                parTarifa.getVlTarifa(),
//                                null,
//                                null);
//
//                        String dsTarifa = parCredencialExiste.getNmLocadora();
//                        if (!Utils.isListNothing(rates.getRateDetailsInfo().getAssociatedCharges())) {
//                            dsTarifa = UtilsWSCar.buscaInclusoes(integrador, cdLocadora, sgMoeda, parCredencialExiste.getNmLocadora(), rates.getRateDetailsInfo().getAssociatedCharges());
//                        }
//                        tarifa.setDsTarifa(dsTarifa);
//
//                        tarifa.setDsParametro(dsParametro);
//
//                        Double vlTotalTaxa = Utils.somar(parTarifa.getVlTaxaAdm(), parTarifa.getVlDevolucao());
//
//                        List<WSTarifaAdicional> tarifaAdicionalList = new ArrayList();
//                        if (vlTotalTaxa > 0.0) {
//                            tarifaAdicionalList.add(new WSTarifaAdicional(WSTarifaAdicionalTipoEnum.TAXA_SERVICO, "Taxa administrativa", sgMoeda, vlTotalTaxa));
//                            tarifa.setTarifaAdicionalList(tarifaAdicionalList);
//                        }
//
//                        List<WSMedia> mediaList = new ArrayList();
//                        List<WSVeiculoDetalhe> veiculoDetalheList = new ArrayList();
//
//                        String classe = UtilsWSCar.buscaClasse(rates.getVehicleTypeInfo().getVehicleCharacteristic().getVehicleRentalPrefType());
//                        veiculoDetalheList.add(new WSVeiculoDetalhe(WSVeiculoDetalheEnum.CATEGORIA, (classe != null ? classe : "Não informada")));
//
//                        Integer qtPassageiro = 0;
//                        String nmModeloCarro = null;
//                        if (rates.getSizedPictures() != null) {
//                            try {
//                                for (CarAvailabilityReply.AvailabilityDetails.Rates.SizedPictures sp : rates.getSizedPictures()) {
//                                    if (sp != null && sp.getImageURL() != null && sp.getImageURL().getAddress() != null && sp.getImageURL().getAddress().getIdentifier() != null) {
//                                        mediaList.add(new WSMedia(WSMediaCategoriaEnum.VEICULO, sp.getImageURL().getAddress().getIdentifier()));
//                                    }
//
//                                    if (sp != null && sp.getVehicleInformation() != null && sp.getVehicleInformation().getVehicleInfo() != null) {
//                                        try {
//                                            for (CarAvailabilityReply.AvailabilityDetails.Rates.SizedPictures.VehicleInformation.VehicleInfo vi : sp.getVehicleInformation().getVehicleInfo()) {
//                                                if (vi.getQualifier() != null && vi.getQualifier().matches("FPX|RPX")) {//QTDE DE PAX DIANTEIRO E TRAZEIRO
//                                                    qtPassageiro = qtPassageiro + vi.getValue().intValue();
//                                                } else if (vi.getQualifier() != null && vi.getQualifier().equals("NOD")) {
//                                                    veiculoDetalheList.add(new WSVeiculoDetalhe(
//                                                            WSVeiculoDetalheEnum.QT_PORTAS,
//                                                            (vi.getValue() != null ? vi.getValue().toString() : "Não informado")));
//                                                } else if (vi.getQualifier() != null && vi.getQualifier().equals("PAX")) {//capacidade de pax
//                                                    qtPassageiro = vi.getValue().intValue();
//                                                }
//                                            }
//                                        } catch (Exception ex) {
//                                            throw new ErrorException(integrador, DisponibilidadeCarWS.class, "Disponibilidade", WSMensagemErroEnum.SDI, "Erro ao ler VehicleInfo", WSIntegracaoStatusEnum.NEGADO, ex, false);
//                                        }
//                                    }
//
//                                    if (sp != null && sp.getVehicleInformation() != null && sp.getVehicleInformation().getNonNumericalAttributes() != null) {
//                                        try {
//                                            sp.getVehicleInformation().getNonNumericalAttributes().stream().filter((nna) -> (nna.getAttributeType().equals("BS"))).forEachOrdered((nna) -> {
//                                                veiculoDetalheList.add(new WSVeiculoDetalhe(WSVeiculoDetalheEnum.QT_BAGAGEM, (nna.getAttributeDescription() != null ? nna.getAttributeDescription() : "Não informado")));
//                                            });
//                                        } catch (Exception ex) {
//                                            throw new ErrorException(integrador, DisponibilidadeCarWS.class, "Disponibilidade", WSMensagemErroEnum.SDI, "Erro ao ler NonNumericalAttributes", WSIntegracaoStatusEnum.NEGADO, ex, false);
//                                        }
//                                    }
//                                    if (sp != null && sp.getPictureCaption() != null && sp.getPictureCaption().getFreeText().size() > 0) {
//                                        nmModeloCarro = sp.getPictureCaption().getFreeText().get(0);
//                                    }
//                                    if (nmModeloCarro == null && sp.getVehicleInformation().getCarModel() != null) {
//                                        nmModeloCarro = sp.getVehicleInformation().getCarModel();
//                                    }
//                                }
//
//                            } catch (Exception ex) {
//                                throw new ErrorException(integrador, DisponibilidadeCarWS.class, "Disponibilidade", WSMensagemErroEnum.SDI, "Erro ao ler SizedPictures", WSIntegracaoStatusEnum.NEGADO, ex, false);
//                            }
//                        }
//                        //busca imagem local
//                        if (Utils.isListNothing(mediaList)) {
//                            String mediaLocal = UtilsWSCar.buscaImagemVeiculo(isNacional, cdLocadora, rates.getVehicleTypeInfo().getVehicleCharacteristic().getVehicleRentalPrefType());
//                            if (mediaLocal != null) {
//                                mediaList.add(new WSMedia(WSMediaCategoriaEnum.VEICULO, mediaLocal));
//                            }
//                        }
//
//                        if (qtPassageiro > 0) {
//                            veiculoDetalheList.add(new WSVeiculoDetalhe(WSVeiculoDetalheEnum.QT_PASSAGEIRO, qtPassageiro.toString()));
//                        }
//
//                        String transmissao = UtilsWSCar.buscaTransmissao(rates.getVehicleTypeInfo().getVehicleCharacteristic().getVehicleRentalPrefType().substring(2, 3));
//                        veiculoDetalheList.add(new WSVeiculoDetalhe(WSVeiculoDetalheEnum.TRANSMISSAO, (transmissao != null ? transmissao : "Não informada")));
//
//                        veiculoDetalheList.add(new WSVeiculoDetalhe(WSVeiculoDetalheEnum.AR_CONDICIONADO, UtilsWSCar.buscaArCondicionado(rates.getVehicleTypeInfo().getVehicleCharacteristic().getVehicleRentalPrefType().substring(3, 4))));//ajustar
//
//                        List<WSReservaNome> reservaNomeList = new ArrayList();
//                        reservaNomeList.add(new WSReservaNome(WSPaxTipoEnum.ADT));
//
//                        for (CarAvailabilityReply.AvailabilityDetails.Rates.PickupDropoffLocations pdl : rates.getPickupDropoffLocations()) {
//                            if (pdl.getLocationType().equals("PUP")) {
//                                cdLocadoraRetirada = pdl.getLocationDescription().getName();
//                            } else if (pdl.getLocationType().equals("DOL")) {
//                                cdLocadoraDevolucao = pdl.getLocationDescription().getName();
//                            }
//                        }
//                        // modelo do carro
//                        String nmModeloVeiculo = null;
//                        if (nmModeloCarro != null) {
//                            nmModeloVeiculo = nmModeloCarro;
//                        }
//                        if (nmModeloVeiculo != null) {
//                            if (rates.getVehicleTypeInfo().getCarModel() != null) {
//                                if (!rates.getVehicleTypeInfo().getCarModel().equals(nmModeloVeiculo)) {
//                                    nmModeloVeiculo += " - " + rates.getVehicleTypeInfo().getCarModel();
//                                }
//                            }
//                        }
//                        if (nmModeloVeiculo == null) {
//                            nmModeloVeiculo = rates.getVehicleTypeInfo().getCarModel();
//                        }
//                        if (nmModeloVeiculo == null) {
//                            nmModeloVeiculo = UtilsWSCar.buscaModeloVeiculo(isNacional, cdLocadora, rates.getVehicleTypeInfo().getVehicleCharacteristic().getVehicleRentalPrefType());
//                        }
//                        if (nmModeloVeiculo == null) {
//                            nmModeloVeiculo = rates.getCarCompanyData().getCompanyName();
//                        }
//                        WSVeiculo veiculo = new WSVeiculo(null,
//                                localRetiradaMap.get(rates.getCarCompanyData().getCompanyCode() + cdLocadoraRetirada),
//                                localDevolucaoMap.get(rates.getCarCompanyData().getCompanyCode() + cdLocadoraDevolucao),
//                                dtRetirada,
//                                dtDevolucao,
//                                classe,
//                                nmModeloVeiculo,
//                                veiculoDetalheList,
//                                locadora,
//                                null,
//                                WSServicoTipoEnum.VEICULO,
//                                rates.getVehicleTypeInfo().getVehicleCharacteristic().getVehicleRentalPrefType(),
//                                nmModeloVeiculo + " " + rates.getCarCompanyData().getCompanyName(),
//                                null,
//                                reservaNomeList,
//                                tarifa,
//                                dtRetirada,
//                                mediaList,
//                                null,
//                                null,
//                                false,
//                                null,
//                                null,
//                                "Drop Charge",
//                                sgMoeda,
//                                null);
//                        veiculo.setDtServicoFim(dtDevolucao);
//                        veiculoList.add(veiculo);
//
//                        WSVeiculoPesquisa veiculoPesquisa = new WSVeiculoPesquisa(null,
//                                veiculoList,
//                                null);
//                        veiculoPesquisaList.add(veiculoPesquisa);
//                    }
//                }
//            } catch (Exception ex) {
//                // throw new ErrorException(disponibilidadeVeiculoRQ.getIntegrador(), DisponibilidadeWS.class, "Disponibilidade", WSMensagemErroEnum.SDI, "Erro ao ler Rates", WSIntegracaoStatusEnum.NEGADO, ex);
//            }
//
//            for (String map : naoMostraTarifaMap) {
//                dsMensagem = (dsMensagem == null ? map : dsMensagem + ", " + map);
//            }
//            if (dsMensagem != null) {
//                integrador.setDsMensagem(dsMensagem);
//            }
//        }
//
//        return veiculoPesquisaList;
//    }
//
//
//    private StatusType79177S montaStatusType79177S(String parametro) {
//        StatusType79177S statusType79177S = new StatusType79177S();
//        StatusDetailsTypeI detailsTypeI = new StatusDetailsTypeI();
//
//        detailsTypeI.setIndicator(parametro);
//        statusType79177S.setStatusDetails(detailsTypeI);
//        return statusType79177S;
//    }
//
//    private CarAvailability.PickupDropoffInfo montaPickupDropoffInfo(WSDisponibilidadeVeiculoRQ disponibilidadeVeiculoRQ) {
//
//        CarAvailability.PickupDropoffInfo dropoffInfo = new CarAvailability.PickupDropoffInfo();
//        StructuredPeriodInformationType structuredPeriodInformationType = new StructuredPeriodInformationType();
//
//        structuredPeriodInformationType.setBeginDateTime(montaData(disponibilidadeVeiculoRQ.getDtRetirada()));//retirada
//        structuredPeriodInformationType.setEndDateTime(montaData(disponibilidadeVeiculoRQ.getDtDevolucao()));//devolucao
//        dropoffInfo.setPickupDropoffTimes(structuredPeriodInformationType);
//
//        String cdLatitudeRetirada = disponibilidadeVeiculoRQ.getCdLatitudeRetirada();
//        String cdLatitudeDevolucao = disponibilidadeVeiculoRQ.getCdLatitudeDevolucao();
//        String cdLongitudeRetirada = disponibilidadeVeiculoRQ.getCdLongitudeRetirada();
//        String cdLongitudeDevolucao = disponibilidadeVeiculoRQ.getCdLongitudeDevolucao();
//
//        String retirada = disponibilidadeVeiculoRQ.getCdLocalRetirada();
//        String devolucao = disponibilidadeVeiculoRQ.getCdLocalDevolucao();
//
//        if (cdLatitudeRetirada != null && cdLongitudeRetirada != null) {
////            dropoffInfo.getPickupDropoffInfo().add(montaLocalCoordenada("PUP", cdLatitudeRetirada, cdLongitudeRetirada, disponibilidadeVeiculoRQ.getIntegrador().getDsCredencialList().get(4)));//retirada
//            dropoffInfo.getPickupDropoffInfo().add(montaLocalCoordenada("PUP", cdLatitudeRetirada, cdLongitudeRetirada, disponibilidadeVeiculoRQ.getQtRaio().toString()));//retirada
//        } else {
//            dropoffInfo.getPickupDropoffInfo().add(montaLocal("PUP", disponibilidadeVeiculoRQ.getCdLocalRetirada()));//retirada
//        }
//
//        if (cdLatitudeDevolucao != null && cdLongitudeDevolucao != null) {
//            if (cdLatitudeRetirada != null && cdLongitudeRetirada != null && cdLatitudeRetirada.equals(cdLatitudeDevolucao) && cdLongitudeRetirada.equals(cdLongitudeDevolucao)) {
//            } else {
////                dropoffInfo.getPickupDropoffInfo().add(montaLocalCoordenada("DOP", cdLatitudeDevolucao, cdLongitudeDevolucao, disponibilidadeVeiculoRQ.getIntegrador().getDsCredencialList().get(4)));//devolucao
//                dropoffInfo.getPickupDropoffInfo().add(montaLocalCoordenada("DOP", cdLatitudeDevolucao, cdLongitudeDevolucao, disponibilidadeVeiculoRQ.getQtRaio().toString()));//devolucao
//            }
//        } else {
//            dropoffInfo.getPickupDropoffInfo().add(montaLocal("DOP", disponibilidadeVeiculoRQ.getCdLocalDevolucao()));//devolucao
//        }
//
//        return dropoffInfo;
//    }
//
//    private CarAvailability.PickupDropoffInfo.PickupDropoffInfo1 montaLocalCoordenada(String parametro, String cdLatitude, String cdLongitude, String raio) {
//        CarAvailability.PickupDropoffInfo.PickupDropoffInfo1 dropoffInfo1 = new CarAvailability.PickupDropoffInfo.PickupDropoffInfo1();
//        ActionIdentificationTypeI79189S actionIdentificationTypeI79189S = new ActionIdentificationTypeI79189S();
//        actionIdentificationTypeI79189S.setLocationType(parametro);
//        dropoffInfo1.setLocationType(actionIdentificationTypeI79189S);
//
//        GeneralGeographicalInformationType generalGeographicalInformationType = new GeneralGeographicalInformationType();
//        GlobalPositioningSystemType globalPositioningSystemType = new GlobalPositioningSystemType();
//        GeoCodeType codeType = new GeoCodeType();
//
//        globalPositioningSystemType.setEncoding("D");
//
//        String cdLatitudeLimpo = UtilsWSCar.rpad(cdLatitude.replace(".", ""), "0", 12);
//        String cdLongitudeLimpo = UtilsWSCar.rpad(cdLongitude.replace(".", ""), "0", 12);
//
//        switch (cdLatitude.split("\\.")[0].replace("-", "").length()) {
//            case 1:
//                if (cdLatitudeLimpo.contains("-")) {
//                    cdLatitudeLimpo = cdLatitudeLimpo.substring(0, 7);
//                } else {
//                    cdLatitudeLimpo = cdLatitudeLimpo.substring(0, 6);
//                }
//                break;
//            case 2:
//                if (cdLatitudeLimpo.contains("-")) {
//                    cdLatitudeLimpo = cdLatitudeLimpo.substring(0, 8);
//                } else {
//                    cdLatitudeLimpo = cdLatitudeLimpo.substring(0, 7);
//                }
//                break;
//            default:
//                if (cdLatitudeLimpo.contains("-")) {
//                    cdLatitudeLimpo = cdLatitudeLimpo.substring(0, 9);
//                } else {
//                    cdLatitudeLimpo = cdLatitudeLimpo.substring(0, 8);
//                }
//                break;
//        }
//        switch (cdLongitude.split("\\.")[0].replace("-", "").length()) {
//            case 1:
//                if (cdLongitudeLimpo.contains("-")) {
//                    cdLongitudeLimpo = cdLongitudeLimpo.substring(0, 7);
//                } else {
//                    cdLongitudeLimpo = cdLongitudeLimpo.substring(0, 6);
//                }
//                break;
//            case 2:
//                if (cdLongitudeLimpo.contains("-")) {
//                    cdLongitudeLimpo = cdLongitudeLimpo.substring(0, 8);
//                } else {
//                    cdLongitudeLimpo = cdLongitudeLimpo.substring(0, 7);
//                }
//                break;
//            default:
//                if (cdLongitudeLimpo.contains("-")) {
//                    cdLongitudeLimpo = cdLongitudeLimpo.substring(0, 9);
//                } else {
//                    cdLongitudeLimpo = cdLongitudeLimpo.substring(0, 8);
//                }
//                break;
//        }
//
//        codeType.setPorLongitude(BigInteger.valueOf(Long.parseLong(cdLongitudeLimpo)));
//        codeType.setPorLatitude(BigInteger.valueOf(Long.parseLong(cdLatitudeLimpo)));
//        globalPositioningSystemType.setPorPosition(codeType);
//        generalGeographicalInformationType.setPosition(globalPositioningSystemType);
//
//        MeasurementsBatchTypeU measurementsBatchTypeU = new MeasurementsBatchTypeU();
//
//        measurementsBatchTypeU.setMeasurementQualifier("DST");
//
//        MeasurementDetailsTypeU detailsTypeU = new MeasurementDetailsTypeU();
//        detailsTypeU.setSignificance("RD");
//        measurementsBatchTypeU.setMeasurementDetails(detailsTypeU);
//        ValueRangeTypeU rangeTypeU = new ValueRangeTypeU();
//        rangeTypeU.setMeasureUnitQualifier("2");
//        rangeTypeU.setMeasurementValue(raio);
//        measurementsBatchTypeU.setValueRange(rangeTypeU);
//        generalGeographicalInformationType.setDistance(measurementsBatchTypeU);
//        dropoffInfo1.setLocationGeocodeInfo(generalGeographicalInformationType);
//
//        // TKT 20886 - POSSIBILITAR UM MAIOR NÚMERO DE RETORNO DE LOJAS POR RAIO (DEFAULT = 5 PARAMETRIZADO = 10)
//        ActionDetailsTypeI79191S actionDetailsTypeI79191S = new ActionDetailsTypeI79191S();
//        ProcessingInformationTypeI processingInformationType = new ProcessingInformationTypeI();
//        processingInformationType.setNumberOfItems(BigInteger.TEN); // limite de agências de uma locadora a serem retornadas (10)
//        actionDetailsTypeI79191S.setNumberOfItemsDetails(processingInformationType);
//        dropoffInfo1.getLocationGeocodeInfo().setLocationQuantity(actionDetailsTypeI79191S);
//
//        return dropoffInfo1;
//    }
//
//    private CarAvailability.PickupDropoffInfo.PickupDropoffInfo1 montaLocal(String parametro, String iata) {
//        CarAvailability.PickupDropoffInfo.PickupDropoffInfo1 dropoffInfo1 = new CarAvailability.PickupDropoffInfo.PickupDropoffInfo1();
//        ActionIdentificationTypeI79189S actionIdentificationTypeI79189S = new ActionIdentificationTypeI79189S();
//
//        actionIdentificationTypeI79189S.setLocationType(parametro);
//        dropoffInfo1.setLocationType(actionIdentificationTypeI79189S);
//
//        // adicionado a IataCitytLocations com o VicinityInfo com o valor "C" conforme orientado pelo suporte Amadeus (TKT 26747)
////        IataCitytLocations iataCityLocations = new IataCitytLocations();
////        SelectionDetailsType vicinityInfo = new SelectionDetailsType();
////        SelectionDetailsInformationTypeI258238C informationType = new SelectionDetailsInformationTypeI258238C();
////        
////        informationType.setVicinityCode("C");
////        vicinityInfo.setVicinityInfo(informationType);
////        iataCityLocations.setLocationServices(vicinityInfo);
//
//        PlaceLocationIdentificationTypeU79190S identificationTypeU79190S = new PlaceLocationIdentificationTypeU79190S();
//        LocationIdentificationBatchTypeU121628C identificationBatchTypeU121628C = new LocationIdentificationBatchTypeU121628C();
//
//        identificationBatchTypeU121628C.setCode("1A");
//        identificationBatchTypeU121628C.setName(iata);
//        identificationTypeU79190S.setLocationDescription(identificationBatchTypeU121628C);
////        iataCityLocations.setIataAirportCityLocationCode(identificationTypeU79190S);
//
////        dropoffInfo1.setIataCitytLocations(iataCityLocations);
//        dropoffInfo1.setIataAirportLocations(identificationTypeU79190S);
//        return dropoffInfo1;
//    }
//
//    private StructuredDateTimeType montaData(Date dt) {
//        BigInteger bgDia = new BigInteger(Utils.formatData(dt, "dd"));
//        BigInteger bgHora = new BigInteger(Utils.formatData(dt, "HH"));
//        BigInteger bgMinuto = new BigInteger(Utils.formatData(dt, "mm"));
//        BigInteger bgMes = new BigInteger(Utils.formatData(dt, "MM"));
//        BigInteger bgAno = new BigInteger(Utils.formatData(dt, "yyyy"));
//
//        StructuredDateTimeType dateTimeType = new StructuredDateTimeType();
//        dateTimeType.setDay(bgDia);
//        dateTimeType.setHour(bgHora);
//        dateTimeType.setMinutes(bgMinuto);
//        dateTimeType.setMonth(bgMes);
//        dateTimeType.setYear(bgAno);
//        return dateTimeType;
//    }
//
//    private List<CarAvailability.ProviderSpecificOptions1> montaProviderSpecificOptions(List<ParCredencial> parCredencialList, WSIntegrador integrador, Integer qtDiasSolicitados) throws ErrorException {
//
//        //agrupa as credencias por locadora
//        Map<String, Map<String, List<String>>> mapAgrupaLocadora = new HashMap();
//
//        Integer sqRegra = 0;
//        for (ParCredencial pc : parCredencialList) {
//
//            Map<String, List<String>> tourCodeMap = mapAgrupaLocadora.get(pc.getSgLocadora());
//            if (tourCodeMap == null) {
//                tourCodeMap = new HashMap();
//            }
//
//            List<String> tourCodeList = new ArrayList();
//            for (String s : pc.getTourCodeChave()) {
//                List<String> tourCredList = Arrays.asList(s.split("/"));
//
//                for (String x : tourCredList) {
//                    if (!x.contains("*") && x.length() > 2) {
//                        tourCodeList.add(x);
//                        //tourCodeMap.put(s, s.substring(0, 2));
//                    }
//                }
//            }
//            sqRegra++;
//            tourCodeMap.put(sqRegra.toString(), tourCodeList);
//            mapAgrupaLocadora.put(pc.getSgLocadora(), tourCodeMap);
//
//        }
//
//        List<CarAvailability.ProviderSpecificOptions1> providerSpecificOptions1List = new ArrayList();
//
//        for (Map.Entry<String, Map<String, List<String>>> map : mapAgrupaLocadora.entrySet()) {
//
//            CarAvailability.ProviderSpecificOptions1 providerSpecificOptions1 = new CarAvailability.ProviderSpecificOptions1();
//
//            CompanyInformationType companyInformationType = new CompanyInformationType();
//            companyInformationType.setCompanyCode(map.getKey());
//            providerSpecificOptions1.setCompanyDetails(companyInformationType);
//
//            for (Map.Entry<String, List<String>> pct : map.getValue().entrySet()) {
//
//                CarAvailability.ProviderSpecificOptions1.LoyaltyNumbersList loyaltyNumbersList = new CarAvailability.ProviderSpecificOptions1.LoyaltyNumbersList();
//                ConsumerReferenceInformationTypeU consumerReferenceInformationTypeU = new ConsumerReferenceInformationTypeU();
//
//                for (String s : pct.getValue()) {
//                    ConsumerReferenceIdentificationTypeU consumerReferenceIdentificationTypeU = new ConsumerReferenceIdentificationTypeU();
//                    consumerReferenceIdentificationTypeU.setReferenceQualifier(s.substring(0, 2));
//                    consumerReferenceIdentificationTypeU.setReferenceNumber(s.substring(2, s.length()));
//                    consumerReferenceInformationTypeU.getCustomerReferenceInfo().add(consumerReferenceIdentificationTypeU);
//                }
//                loyaltyNumbersList.setDiscountNumbers(consumerReferenceInformationTypeU);
//                providerSpecificOptions1.getLoyaltyNumbersList().add(loyaltyNumbersList);
//            }
//            providerSpecificOptions1List.add(providerSpecificOptions1);
//        }
//        return providerSpecificOptions1List;
//    }
//
//    private WSVeiculoLocal montaVeiculoLocal(CarAvailabilityReply.AvailabilityDetails.CompanyLocationInfo.RentalLocation rentalLocation, String cdLocadora, String nmLocadora) {
//
//        WSVeiculoLocal veiculoLocal = null;
//
//        String cdLoja = rentalLocation.getAddress().getLocationDetails().getName();
//
//        CarAvailabilityReply.AvailabilityDetails.CompanyLocationInfo.RentalLocation location = rentalLocation;
//
//        if (location.getAddress().getAddressDetails().getLine1() == null || (location.getAddress().getAddressDetails().getLine1().equals("") && Utils.locadoraMap != null && Utils.locadoraMap.get(cdLocadora + "#" + cdLoja) != null)) {
//            WSVeiculoLocadora veiculoLocadora = Utils.locadoraMap.get(cdLocadora + "#" + cdLoja);
//            veiculoLocal = new WSVeiculoLocal(cdLoja,
//                    veiculoLocadora.getNmLocadora().trim(),
//                    (veiculoLocadora.getEndereco() != null ? veiculoLocadora.getEndereco().getDsEndereco() : null),
//                    (veiculoLocadora.getEndereco() != null && veiculoLocadora.getEndereco().getMunicipio() != null ? veiculoLocadora.getEndereco().getMunicipio().getNmMunicipio() : null),
//                    (veiculoLocadora.getEndereco() != null && veiculoLocadora.getEndereco().getMunicipio() != null ? veiculoLocadora.getEndereco().getMunicipio().getNmPais() : null),
//                    (veiculoLocadora.getTelefone() != null ? veiculoLocadora.getTelefone().getTransNrTelefone() : null),
//                    (veiculoLocadora.getEndereco() != null ? veiculoLocadora.getEndereco().getNrLatitude() : null),
//                    (veiculoLocadora.getEndereco() != null ? veiculoLocadora.getEndereco().getNrLongitude() : null));
//
//        } else {
//            veiculoLocal = new WSVeiculoLocal(location.getAddress().getLocationDetails().getName(),
//                    nmLocadora,
//                    location.getAddress().getAddressDetails().getLine1() + " " + (location.getAddress().getAddressDetails().getLine2() != null ? location.getAddress().getAddressDetails().getLine2() : ""),
//                    location.getAddress().getCity(),
//                    location.getAddress().getCountryCode(),
//                    null);
//        }
//
//        return veiculoLocal;
//    }
//}

    
}
