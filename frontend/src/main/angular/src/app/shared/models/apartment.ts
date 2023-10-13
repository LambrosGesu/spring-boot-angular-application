export interface Apartment {
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
}


export interface BookInfo{
  reservationId: number;
  bookedHomeId: number;
  dateIn: string;
  dateOut: string;
  isBooked: number;
  userIdBooked: number;
  userNameBooked: string;
  hostReviewStars: number;
  hostReviewDescription: string;
  homeReviewStars: number;
  homeReviewDescription: string;
}
