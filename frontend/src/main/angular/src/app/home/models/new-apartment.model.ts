import {BookInfo} from "../../shared/models/apartment";

export class NewApartment {
  id: number;
  hostId: number;
  title: string;
  country: string;
  region: string;
  reservations: BookInfo[];
  cancellation_policy: boolean;
  price: number;
  address: string;
  latitude: string;
  longitude: string;
  description: string;
  squareMeters: number;
  overnightPrice: number;
  costPerExtraGuest: number;
  maxPeople: number;
  minOvernights: number;
  numOfBeds: number;
  bathrooms: number;
  numOfRooms: number;
  numOfWc: number;
  livingRoom: boolean;
  elevator: boolean;
  heating: boolean;
  kitchen: boolean;
  parking: boolean;
  tv: boolean;
  wifi: boolean;
  ac: boolean;
  pets: boolean;
  events: boolean;


  constructor(hostId: number, title: string, country: string, region: string, cancellation_policy: boolean, price: number, address: string, description: string) {
    this.hostId = hostId;
    this.title = title;
    this.country = country;
    this.region = region;
    this.cancellation_policy = cancellation_policy;
    this.price = price;
    this.address = address;
    this.description = description;
  }
}


